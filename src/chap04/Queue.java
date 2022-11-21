package chap04;

public class Queue<E> {

    private E[] que;        // 큐용 배열
    private int capacity;   // 큐의 용량
    private int num;        // 현재 데이터 개수
    private int front;      // 프런트 요소 커서
    private int rear;       // 리어 요소 커서


    public Queue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }


    public E enque(E e) {
        if (num >= capacity) {
            System.out.println("큐가 가득 찼습니다.");
        }
        que[rear++] = e;
        num++;
        if (rear >= capacity) {
            rear = 0;
        }
        return e;
    }

    public E deque() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        }
        E result = que[front++];
        num--;
        if (front >= capacity) {
            front = 0;
        }
        return result;
    }

    public E peek() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        }
        return que[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == e) {
                return idx;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                int idx = (i + front) % capacity;
                System.out.print(que[idx] + " ");
            }
            System.out.println();
        }
    }

}
