package chap04;

public class Stack<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    // 생성자
    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E[]) new Object[capacity];        // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {      // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public E push(E x) {
        if (isFull()) {
            return null;
        } else {
            return stk[ptr++] = x;
        }
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public E pop() throws IntStack.EmptyIntStackException {
        if (isEmpty()) {
            return null;
        } else {
            return stk[--ptr];
        }
    }

    // 스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public E peek() throws IntStack.EmptyIntStackException {
        if (isEmpty()) {
            return null;
        } else {
            return stk[ptr - 1];
        }
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찾는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
