import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Nathan on 4/29/2016.
 */
public class StackClass {


    int postfixEvaluation(String str)
    {
        Stack<Integer> st = new Stack<Integer>();
        if(str.length()<1)
            return -1;
        for(int k=0; k<str.length();k++)
        {
            char ch =  str.charAt(k);
            if(Character.isDigit(ch))
                st.push(Character.getNumericValue(ch));
            else
            {
                int  i=-1;
                int j=-1;
                if(!st.empty())
                {
                    i = st.pop();
                }
                if(!st.empty())
                {
                    j = st.pop();

                }

                int val = calculate(i,j,ch);
                st.push(val);


            }


        }
        return st.peek();
    }

    int calculate(int i, int j, int ch) {
        if (ch == '+')
            return i + j;
        if (ch == '-')
            return j - i;
        if (ch == '/')
            return i / j;

        return i * j;
    }



    /**
     * Karumanchi : Prob 4
     * For evaluating the value of infix expression
     *
     */
    int evalueateinfix(String str)
    {
        Stack<Integer> intStack = new Stack<Integer>();
        Stack<Character> charStack = new Stack<Character>();

        if(str.length()<1 )
            return -1;
        else
        {

            for (int k = 0; k < str.length(); k++)
            {
                char ch = str.charAt(k);
                if (Character.isDigit(ch))
                    intStack.push(Character.getNumericValue(ch));
                else
                {

                    int val = -1;
                    if (charStack.empty() || ch == '(' || charStack.peek() == '(') {
                        charStack.push(ch);
//                        break;
                    }
                    else if (ch == ')') {
                        while (!charStack.empty() && charStack.peek() != '(') {
                            val = calculate(intStack.pop(), intStack.pop(), charStack.pop());
                            intStack.push(val);
                        }
                        charStack.pop();
//                        break;
                    }
                    else
                    {
                        while (precedance(ch) < precedance(charStack.peek()))
                        {
                            // keep popping till the precedance of operator in ch is less than the precedance of operator on top of stack

                            val = calculate(intStack.pop(), intStack.pop(), charStack.pop());
                            intStack.push(val);



                        }
                        charStack.push(ch);
                    }



                }
            }
            while(!charStack.empty()){
                int val = calculate(intStack.pop(), intStack.pop(), charStack.pop());
                intStack.push(val);
            }

        }
        return intStack.peek();
    }

    int calculate(int i, int j, char ch) {
        if (ch == '+')
            return i + j;
        if (ch == '-')
            return j - i;
        if (ch == '/')
            return i / j;

        return i * j;
    }

    int precedance(char operator)
    {
        if(operator =='+' || operator == '-')
            return 1;
        return 2;

    }

    /**
     * karumanchi : problem 5
     * Find Minimum in O(1) time
     *
     */
    void constructStack(int[] arr, Stack<StackNode> stack)
    {
        if(arr.length<1)
        {
            System.out.println(" Array is empty");
            return;
        }
        for(int k =0; k<arr.length; k++)
        {
            StackNode snode;

                if(stack.empty() || arr[k]<stack.peek().minVal )
                {
                    snode = new StackNode(arr[k], arr[k]);
                    stack.push(snode);
                }
                else
                {
                    snode = new StackNode(stack.peek().minVal, arr[k]);
                    stack.push(snode);
                }


        }
    }

    int findMinimum(Stack<StackNode> st)
    {
        if(st.empty())
        {

            return -1;
        }
        return st.peek().minVal;

    }

    /**
     * karumanchi : Problem 11
     * Reversing stack in O(n) space complexity
     * using only one stack.
     * used Recursion
     */
    void reverseStack(Stack<Integer> st)
    {
        int data;
        if(st.empty())
            return;
        data=st.pop();
        reverseStack(st);
        insertAtBotton(st, data);

    }

    void insertAtBotton(Stack<Integer> st, int data)
    {
        int temp;
        if(st.empty())
        {
            st.push(data);
            return;
        }
        temp = st.pop();
        insertAtBotton(st,data);
        st.push(temp);
    }

    /**
     * Karumanchi: Problem 12
     * Implement a queue using two stacks
     */
    void enqueue(Stack st, int data)
    {
        st.push(data);
    }

    int dequeue(Stack<Integer> st1, Stack<Integer> st2)
    {
        if(!st2.empty())
        {
            return st2.pop();
        }
        while(!st1.empty())
        {
            st2.push(st1.pop());
        }
        if(st2.empty())
            return -1;
        return st2.pop();
    }


    public static void main(String args[])
    {
        StackClass sc = new StackClass();

//        String postfix = "123*+5-";
//        int val = sc.postfixEvaluation(postfix);
        String infix = "1+2*(6-3)";
        int val = sc.evalueateinfix(infix);
        if (val == -1)
            System.out.println(" Expression is Empty ");
        else
            System.out.println("Postfix Eval is "+val);

        // test for minStack
        int[] intArr = {2,9,5,6,4,8,3,1};
        Stack<StackNode> st = new Stack<StackNode>();
        sc.constructStack(intArr, st);
        st.pop();
        if(sc.findMinimum(st)<0)
            System.out.println(" Stack Empty");
        else
            System.out.println("Min Stack Value is "+sc.findMinimum(st));

        //test for problem 11: reversing Stack using only one stack
        Stack<Integer> st1 = new Stack<Integer>();
        for(int i=1;i<6; i++)
            st1.push(i);

        System.out.println(" Top of the stack is "+st1.peek());
        System.out.println(Arrays.toString(st1.toArray()));
        sc.reverseStack(st1);
        System.out.println("After reversal top of the stack is "+st1.peek());
        System.out.println(Arrays.toString(st1.toArray()));
        // test for problem 12 : implementing stacks using queues
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for(int i=1;i<6; i++)
        {
            sc.enqueue(stack1,i);
            System.out.println(i+" has been enqueued ");
        }

        System.out.println(Arrays.toString(stack1.toArray()));
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
        System.out.println(sc.dequeue(stack1,stack2)+" has been dequed");
    }

}
