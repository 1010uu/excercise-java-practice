package control;

import java.util.Scanner;

public class Practice10 {

    public void practice10() {

        showMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("실습문제" + choice + " 실행");

        if (choice == 5) {
            Practice05 execute = new Practice05();
            execute.practice05();
        }
        if (choice == 6) {
            Practice06 execute = new Practice06();
            execute.practice06();
        }
        if (choice == 7) {
            Practice07 execute = new Practice07();
            execute.practice07();
        }
        if (choice == 8) {
            Practice08 execute = new Practice08();
            execute.practice08();
        }
        if (choice == 9) {
            Practice09 execute = new Practice09();
            execute.practice09();
        }
    }
    public void showMenu(){
        System.out.println("실행할 기능을 선택하세요 : ");
        System.out.println("1.메뉴 출력");
        System.out.println("2.짝수/홀수");
        System.out.println("3.합격/불합격");
        System.out.println("4.계절");
        System.out.println("5.로그인");
        System.out.println("6.권한확인");
        System.out.println("7.BMI");
        System.out.println("8.계산기");
        System.out.println("9.P/F");
        System.out.println("선택 : ");
    }
}
