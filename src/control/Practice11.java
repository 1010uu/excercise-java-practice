package control;

import java.util.Scanner;

public class Practice11 {
    public void practice11(){
        //입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호 입력(1000~9999) : ");
        String input = sc.nextLine();

        int maximum = 4; //최대 4자리
        if ( input.length() != maximum ){
            System.out.println("자리수 안맞음");
        }
        else{
            int num1 = input.charAt(0);
            int num2 = input.charAt(1);
            int num3 = input.charAt(2);
            int num4 = input.charAt(3);

            if( num1 < 49 || num1 > 57) { //0의 아스키코드 == 48
                System.out.println("제일 앞자리는 1~9사이의 수를 입력하세요.");
            } else if (num1 == num2){
                System.out.println("중복값 있음");
            } else if (num1 == num3) {
                System.out.println("중복값 있음");
            } else if (num1 == num4) {
                System.out.println("중복값 있음");
            } else if (num2 == num3) {
                System.out.println("중복값 있음");
            } else if (num2 == num4) {
                System.out.println("중복값 있음");
            } else if (num3 == num4) {
                System.out.println("중복값 있음");
            } else {
                System.out.println("성공");
            }
        }
    }
}
