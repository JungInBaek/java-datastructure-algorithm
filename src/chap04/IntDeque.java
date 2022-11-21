package chap04;

public class IntDeque {

    private int[] deque;
    private int capacity;
    private int num;
    private int front1;
    private int rear1;

    private int front2;

    private int rear2;


    public IntDeque(int maxlen) {
        capacity = maxlen;
        num = front1 = rear1 = 0;
        front2 = rear2 = capacity - 1;
        try {
            deque = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }


    public int enqueFront(int x) throws OverflowIntDequeException {
        if (rear1 > rear2) {
            throw new OverflowIntDequeException();
        }
        deque[rear1++] = x;
        num++;

        return x;
    }

    public int dequeFront() throws EmptyIntDequeException {
        if (rear1 <= front1) {
            throw new EmptyIntDequeException();
        }
        int result = deque[front1];
        num--;
        rear1--;
        for (int i = 0; i < rear1; i++) {
            deque[i] = deque[i + 1];
        }

        return result;
    }

    public int enqueRear(int x) throws OverflowIntDequeException {
        if (rear2 < rear1) {
            throw new OverflowIntDequeException();
        }
        deque[rear2--] = x;
        num++;

        return x;
    }

    public int dequeRear(int x) throws EmptyIntDequeException {
        if (rear2 >= front2) {
            throw new EmptyIntDequeException();
        }
        int result = deque[front2];
        num--;
        rear2++;
        for (int i = front2; i > rear2; i--) {
            deque[i] = deque[i - 1];
        }

        return result;
    }

    public int peekFront() throws EmptyIntDequeException {
        if (rear1 <= front1) {
            throw new EmptyIntDequeException();
        }
        return deque[front1];
    }

    public int peekRear() throws EmptyIntDequeException {
        if (rear2 >= front2) {
            throw new EmptyIntDequeException();
        }
        return deque[front2];
    }

    public void clear() {
        num = front1 = rear1 = 0;
        front2 = rear2 = capacity - 1;
    }

    public int indexOfFront(int x) {
        for (int i = 0; i < rear1; i++) {
            if (deque[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfRear(int x) {
        for (int i = front2; i > rear2; i--) {
            if (deque[i] == x) {
                return i;
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

    public class EmptyIntDequeException extends RuntimeException {
    }

    public class OverflowIntDequeException extends RuntimeException {
    }

}

