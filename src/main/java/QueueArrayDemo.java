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
    public boolean enqueue(Object x){}

    // 对首元素出队
    public Object dequeue(){}

    // 取对首元素
    public Object getFront(){}

    // 置队列为空操作
    public void setEmpty(){}
}
public class QueueArrayDemo {}
