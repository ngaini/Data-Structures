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
    int calculate(int i, int j, char ch) {
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



    int precedance(char operator)
    {
        if(operator =='+' || operator == '-')
            return 1;
        return 2;

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

    }

}
