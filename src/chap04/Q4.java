package chap04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntArrayQueue arrayQueue = new IntArrayQueue(8);

        while (true) {
            System.out.println();       // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", arrayQueue.size(), arrayQueue.getCapacity());
            System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (0) 종료: ");
            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:     // 인큐
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        arrayQueue.enque(x);
                    } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:     // 디큐
                    try {
                        x = arrayQueue.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:     // 피크
                    try {
                        x = arrayQueue.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:     // 덤프
                    arrayQueue.dump();
                    break;
            }
        }
    }
}
