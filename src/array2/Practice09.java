package array2;

import java.util.Scanner;

public class Practice09 {
    /*
    * 8번 문제에서 자리배치한것을 가지고 학생이름을 검색해
    * 해당 학생이 어느 자리에 앉았는지 출력
    * */
    public void practice() {

        String[][] arr = new String[][] { { "강건강", "남나나" }, { "도대담", "류라라" }, { "문미미", "박보배" } };
        String[][] arr2 = new String[][] { { "송성실", "윤예의" }, { "진재주", "차천축" }, { "피풍표", "홍하하" } };

        System.out.println("== 1분단 ==");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2분단 ==");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("검색할 학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j].equals(name)){
                    if(j == 0){
                        System.out.println("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 왼쪽에 있습니다.");
                        break;
                    }
                    else {
                        System.out.println("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 오른쪽에 있습니다.");
                        break;
                    }
                }
            }
        }
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                if(arr2[i][j].equals(name)){
                    if(j == 0){
                        System.out.println("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 왼쪽에 있습니다.");
                        break;
                    }
                    else {
                        System.out.println("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 오른쪽에 있습니다.");
                        break;
                    }
                }
            }
        }
    }
}
