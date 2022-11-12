package chap04;

public class Q3 {
    // int형 고정 길이 스택
    private int[] stk;      // 스택용 배열
    private int capacity;   // 스택 용량
    private int ptrA;        // 스택 포인터
    private int ptrB;

    // 실행 시 예외: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 예외: 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자
    public Q3(int maxlen) {
        capacity = maxlen;
        ptrA = 0;
        ptrB = capacity - 1;
        try {
            stk = new int[capacity];        // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {      // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택A에 x를 푸시
    public int pushA(int x) throws OverflowIntStackException {
        if (ptrA >= ptrB + 1) {
            throw new OverflowIntStackException();
        }
        return stk[ptrA++] = x;
    }

    // 스택B에 x를 푸시
    public int pushB(int x) throws OverflowIntStackException {
        if (ptrB <= ptrA - 1) {
            throw new OverflowIntStackException();
        }
        return stk[ptrB--] = x;
    }

    // 스택A에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int popA() throws EmptyIntStackException {
        if (ptrA <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptrA];
    }

    // 스택B에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int popB() throws EmptyIntStackException {
        if (ptrB >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[++ptrB];
    }

    // 스택A에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int peekA() throws EmptyIntStackException {
        if (ptrA <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptrA - 1];
    }

    // 스택B에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int peekB() throws EmptyIntStackException {
        if (ptrB >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[ptrB + 1];
    }

    // 스택A를 비움
    public void clearA() {
        ptrA = 0;
    }

    // 스택B를 비움
    public void clearB() {
        ptrB = capacity - 1;
    }

    // 스택A에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOfA(int x) {
        for (int i = ptrA - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 스택B에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOfB(int x) {
        for (int i = ptrB + 1; i <= capacity - 1; i++) {
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
    public int sizeA() {
        return ptrA;
    }

    public int sizeB() {
        return capacity - (ptrB + 1);
    }

    // 스택이 비어 있는가?
    public boolean isEmptyA() {
        return ptrA <= 0;
    }

    public boolean isEmptyB() {
        return ptrB >= capacity - 1;
    }

    // 스택이 가득 찾는가?
    public boolean isFullA() {
        return ptrA >= ptrB + 1;
    }

    public boolean isFullB() {
        return ptrB <= ptrA - 1;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dumpA() {
        if (ptrA <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptrA; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public void dumpB() {
        if (ptrB <= capacity - 1) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = capacity - 1; i < ptrB; i--) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
