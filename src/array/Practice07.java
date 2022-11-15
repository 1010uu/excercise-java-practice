package array;

import java.util.Scanner;

public class Practice07 {
    public void practice07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt(); //배열의 값 입력
        int sum = 0; //합 구하기

        int[] arr = new int[num]; //입력한 값 만큼의 배열 초기화
        for(int i =0; i<num; i++){
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt(); //i번째 인덱스에 값을 입력받아 초기화
            sum += arr[i];
        }

        //숫자 나열을 위한 for문
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("총합 : " + sum);
    }
}
