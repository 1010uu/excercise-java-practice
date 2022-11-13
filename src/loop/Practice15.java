package loop;

import java.util.Scanner;

public class Practice15 {
    /*
    * 1~사용자에게 입력받은 수까지 중
    *   1. 2와 3의 배수를 모두 출력
    *   2. 2와 3의 공배수의 개수를 출력
    * */
    public void practice15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수 하나를 입력하세요 : ");
        int inputNum = sc.nextInt();
        int count = 0;

        for(int i=1; i<=inputNum; i++){
            if(i % 2 == 0 || i % 3 == 0){
                System.out.print(i+" ");
            }
            if(i % 2 == 0 && i % 3 == 0){
                count += 1;
            }
        }
        System.out.println();
        System.out.println("2와 3의 공배수의 개수: " + count);
    }
}
