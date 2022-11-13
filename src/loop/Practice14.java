package loop;

import java.util.Scanner;

public class Practice14 {
    /*
        1.입력한 수까지의 소수를 모두 출력
        2.소수의 개수를 출력
    */
    public void practice14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력:");
        int inputNum = sc.nextInt();
        int prime = 0; //소수의 총 개수

        for(int i=1; i<=inputNum; i++){ // 1 ~ inputNum 사이에 소수가 있을지 ?
            int count = 0; //소수인지를 구하기 위한 변수 //i가 증가될 때마다 count는 0으로 리셋돼야한다.
            for(int j=1; j<=i; j++){ // i가 소수인지 알아보기 위해 1부터 자기자신(i)의 값 중
                if( i % j == 0){ //나머지가 0인 것만 count한다.
                    count +=1;
                }
            }
            if(count == 2){ //count한 회수가 총 2개면 소수
                prime += 1; //소수의 개수를 더하기 위해 1씩 증가
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("2부터 11까지 소수의 개수는 " + prime);
    }
}
