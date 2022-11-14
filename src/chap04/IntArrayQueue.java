package chap04;

public class IntArrayQueue {

    private int[] que;      // 큐용 배열

    private int capacity;   // 큐의 용량

    private int num;        // 맨 앞의 요소 커서

    private int front;      // 맨 뒤의 요소 커서

    private int rear;       // 현재 데이터 개수


    public IntArrayQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;

        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }


    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntArrayQueueException {
        if (num >= capacity) {
            throw new OverflowIntArrayQueueException();
        }
        que[rear++] = x;
        num++;

        return x;
    }

    // 큐에 데이터를 디큐
    public int deque() throws EmptyIntArrayQueueException {
        if (num <= 0) {
            throw new EmptyIntArrayQueueException();
        }
        int result = que[front];
        num--;
        rear--;
        for (int i = 0; i < num; i++) {     // 요소 이동
            que[i] = que[i + 1];
        }

        return result;
    }

    // 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peek() throws EmptyIntArrayQueueException {
        if (num <= 0) {
            throw new EmptyIntArrayQueueException();
        }
        return que[front];
    }

    // 큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < que.length; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐의 쌓여 있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있나요?
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼나요?
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(que[i]);
                if (i < rear - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }


    // 실행 시 예외: 큐가 비어 있음
    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() {}
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() {}
    }
}
