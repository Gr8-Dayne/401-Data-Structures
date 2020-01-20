package stacksandqueues;

public class Stack {

    Node top;

    public void push(int numberVal) {
        top = new Node(numberVal, top);
    }

    public int pop() {
        int popVal = top.valueData;
        top = top.next;
        return popVal;
    }

    public int peek() {
        return top.valueData;
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }
}