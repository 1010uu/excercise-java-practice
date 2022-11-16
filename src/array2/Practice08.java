package array2;

public class Practice08 {
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

    }
}
