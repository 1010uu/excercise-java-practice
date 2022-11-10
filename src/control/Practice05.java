package control;

import java.util.Scanner;

public class Practice05 {

    public void practice05() {

        String id = "minmin";
        String pwd = "Min1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 : ");
        String inputId = sc.nextLine();

        System.out.println("비밀번호 : ");
        String inputPwd = sc.nextLine();

        if (id.equals(inputId)) {
            if (pwd.equals(inputPwd)) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }
}
