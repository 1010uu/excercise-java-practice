package array;

public class Practice02 {
    /*
    * 길이가 10인 배열을 선언, 1~10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 
    * 값을 출력
    * */
    public void practice02(){
        int[] arr = new int[10];
        int length = arr.length;

        for(int i=length-1; i>=0; i--){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        };
    }
}
