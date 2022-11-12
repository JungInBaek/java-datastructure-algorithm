package chap04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(64);   // 최대 64개를 푸시할 수 있는 스택

        while (true) {
            System.out.println();       // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (5) 검색  (6) 비우기  (0) 종료: ");
            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:     // 푸시
                    if (stack.isFull()) {
                        System.out.println("스택이 가득 찼습니다. 스택을 먼저 비워주세요.");
                        break;
                    }
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        stack.push(x);
                    } catch (Exception e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:     // 팝
                    if (stack.isEmpty()) {
                        System.out.println("스택이 비어 있습니다. 스택을 먼저 채워주세요.");
                        break;
                    }
                    try {
                        x = stack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (Exception e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:     // 피크
                    try {
                        x = stack.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (Exception e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:     // 덤프
                    stack.dump();
                    break;

                case 5:     // 검색
                    if (stack.isEmpty()) {
                        System.out.println("스택이 비어있습니다. 스택을 먼저 채워주세요.");
                        break;
                    }
                    System.out.print("검색할 키 값 입력: ");
                    int key = scanner.nextInt();
                    int idx = stack.indexOf(key);
                    if (idx < 0) {
                        System.out.println("그 값의 요소가 없습니다.");
                    } else {
                        System.out.println("그 값은 " + idx + "에 있습니다.");
                    }
                    break;

                case 6:     // 비우기
                    stack.clear();
                    System.out.println("스택을 비웠습니다.");
                    break;
            }
        }
    }
}
