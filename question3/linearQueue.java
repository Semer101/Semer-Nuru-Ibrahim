package question3;


import java.util.Stack;

class linearQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    void enQueue(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    int deQueue() {
        if (s1.empty()) {
            return -1; // Queue is empty
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        linearQueue q = new linearQueue();
        q.enQueue(43);
        q.enQueue(52);
        q.enQueue(73);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue()); 
        System.out.println(q.deQueue()); 
    }
}



