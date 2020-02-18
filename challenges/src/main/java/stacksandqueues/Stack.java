package stacksandqueues;

public class Stack {

    Node top;

    public void push(Integer numberVal) {
        top = new Node(numberVal, top);
    }

    public Integer pop() {
        Integer popVal = (Integer) top.valueData;
        top = top.next;
        return popVal;
    }

    public String peek() {
        return top.valueData.toString();
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }
}