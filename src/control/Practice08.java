package control;

import java.util.Scanner;

public class Practice08 {
    public void practice08() {

        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 입력 : ");
        int num2 = sc.nextInt();

        double cal ;
        if( num1 > 0 && num2 > 0){
            System.out.print("연산자를 입력(+,-,*,/,%) : ");
            String operator = sc.next();

            switch (operator){
                case "+" :
                    cal = (double)num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + String.format("%.6f", cal));
                    break;
                case "-" :
                    cal = (double)num1 - num2;
                    System.out.println(num1 + "-" + num2  + "=" + String.format("%.6f", cal));
                    break;
                case "*" :
                    cal = (double)num1 * num2;
                    System.out.println(num1 + "*" + num2  + "=" + String.format("%.6f", cal));
                    break;
                case "/" :
                    cal = (double)num1 / num2;
                    System.out.println(num1 + "/" + num2  + "=" + String.format("%.6f", cal));
                    break;
                case "%" :
                    cal = (double)num1 % num2;
                    System.out.println(num1 + "%" + num2  + "=" + String.format("%.6f", cal));
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
