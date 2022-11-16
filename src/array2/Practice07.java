package array2;

import java.util.Scanner;

public class Practice07 {
    /*
    * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 문자형 가변 배열을 선언 
    * 값을 a 부터 할당, 인덱스의 개수만큼 하나씩 늘려 저장
    * */
    public void practice07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 크기 : ");
        int line = sc.nextInt();

        char[][] arr = new char[line][];
        char c = 'a';

        //가변 매열의 열 생성
        for (int i = 0; i < arr.length; i++) {
            System.out.print( i + "행의 열 크기 : ");
            int row = sc.nextInt();
            arr[i] = new char[row];
        }

        //가변 배열에 값 초기화
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = c;
                c = (char)(c + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
