package loop;

import java.util.Scanner;

public class Practice01 {
    public void practice01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력:");
        int inputNum = sc.nextInt();
        int prime = 0;

        for(int i=1; i<=inputNum; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if( i % j == 0){
                    count +=1;
                }
            }
            if(count == 2){
                prime += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("2부터 11까지 소수의 개수는 " + prime);
    }
}
