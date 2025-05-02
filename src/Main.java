//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //practiacalstackStack();
        //practicalQueue();
        practical_Circular_Queue();
    }
    public static void practiacalstackStack(){
        Stack s = new Stack(10);
        s.push(20);
        s.push(30);
        s.push(50);
        s.push(60);
        System.out.println(s);

        s.pop();
        System.out.println(s);
        System.out.println(s.size());

    }
    public static void practicalQueue(){
        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(70);
        q.enqueue(90);
        System.out.println(q);

        q.dequeue();
        q.dequeue();
        System.out.println(q);

        System.out.println("Cannot peek: " + q.peek());
    }
    public static void practical_Circular_Queue(){
        Circular_Queue cq = new Circular_Queue();

        cq.enQueue(10);
        cq.enQueue(70);
        cq.enQueue(90);
        cq.enQueue(29);
        cq.enQueue(50);

        System.out.println("Dequeue : " + cq.deQueue());

        cq.print();
    }
}