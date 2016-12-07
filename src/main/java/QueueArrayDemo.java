/**
 * Created by ScorpionOrange on 2016/12/06.
 */
interface Queue{
    // 返回队列的大小
    public int getSize();

    // 判断队列是否为空
    public boolean isEmpty();

    // 数据元素 X 入队
    public boolean enqueue(Object x);

    // 队首元素出队
    public Object dequeue();

    // 取队首元素
    public Object getFront();

    // 置队列为空操作
    public void setEmpty();
}

class QueueArray implements Queue{

    private Object[] elements; // 数据元素数组
    private int capacity; // 数组的大小 elements.length
    private int front; // 队首指针，指向队首
    private int rear; // 队尾指针，指向队尾后一个位置

    public QueueArray(int capacity){
        this.capacity = capacity;
        elements = new Object[capacity];
        front = -1;
        rear = -1;
    }

    // 返回队列的大小
    public int getSize(){
        int size = (rear - front + capacity) % capacity;
        return size;
    }

    // 判断队列是否为空
    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        else {
            return false;
        }
    }

    // 数据元素 X 入队
    public boolean enqueue(Object x){
        if(getSize() == capacity - 1){
            return false;
        }
        else {
            elements[rear + 1] = x;
            rear = (rear + 1) % capacity;
            return true;
        }
    }

    // 对首元素出队
    public Object dequeue(){
        Object object = null;
        if(isEmpty()){
            return null;
        }
        else {
            object = elements[front + 1];
            front = (front + 1) % capacity;
        }
        return object;
    }

    // 取对首元素
    public Object getFront(){
        Object object = null;
        if(isEmpty()){
            return null;
        }
        else {
            object = elements[front + 1];
        }
        return object;
    }

    // 置队列为空操作
    public void setEmpty(){
        front = -1;
        rear = -1;
    }
}
public class QueueArrayDemo {
    public static void main(String[] args){
        QueueArray queueArray = new QueueArray(10);
        queueArray.enqueue(100);
        System.out.println("元素100入队列。");
        queueArray.enqueue(200);
        System.out.println("元素200入队列。");
        queueArray.enqueue(300);
        System.out.println("元素300入队列。");
        queueArray.enqueue(400);
        System.out.println("元素400入队列。");
        queueArray.enqueue(500);
        System.out.println("元素500入队列。");

        if(queueArray.isEmpty()){
            System.out.println("队列当前为空。");
        }
        else {
            System.out.println("队列当前不为空。");
        }

        System.out.println("队列中有" + queueArray.getSize() + "个元素。");
        System.out.println("队首元素为：" + queueArray.getFront());

        queueArray.dequeue();
        System.out.println("一个元素出队列后，新队首元素为：" + queueArray.getFront());

        queueArray.setEmpty();
        if(queueArray.isEmpty()){
            System.out.println("置队列为空操作后，队列内为空。");
        }
    }
}
