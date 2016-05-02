/**
 * Created by Nathan on 4/29/2016.
 */
public class StackNode {

    int minVal, value;

    StackNode()
    {
        minVal =-1;
        value = -1;
    }

    StackNode(int minValue, int value)
    {
        this.minVal = minValue;
        this.value =value;
    }
}
