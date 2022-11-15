package array;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Practice09 {
    /*
    * 사용자가 입력한 값이 배열에 있는지 없는지 검색
    * 있으면 배달가능, 없으면 없는 메뉴입니다.
    * */
    public void practice09() {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"교촌", "굽네", "비비큐", "후참잘", "처갓집"};
        System.out.print("치킨 이름을 입력하세요 : ");
        String input = sc.nextLine(); //입력 받기

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(input)){
                System.out.println(input + "은 배달가능");
                break;
            }
            else{
                if( arr.length-1 == i ) {
                    System.out.println(input + "은 없는 메뉴입니다.");
                }
            }
        }
    }
}
