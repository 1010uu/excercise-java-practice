package control;

import java.util.Scanner;

public class Practice09 {
    public void practice09() {

        Scanner sc = new Scanner(System.in);
        //중간고사
        System.out.print("중간고사 점수 : ");
        int inputMid = sc.nextInt();
        //기말고사
        System.out.print("기말고사 점수 : ");
        int inputFinals = sc.nextInt();
        //과제점수
        System.out.print("과제 점수 : ");
        int inputAssignment = sc.nextInt();
        //출석회수
        System.out.print("출석 회수 : ");
        int inputAttendance = sc.nextInt();

        int attendance = 20; //총 출석회수
        int limit = 20 * 30 / 100; //30%이상 결석 //6회
        double result = showResult(inputMid, inputFinals, inputAssignment, inputAttendance);
        int absent = beAbsent(attendance, inputAttendance);
        if ( absent > limit ) { //6회 이상 결석
            System.out.print("Fail [츨석 회수 부족("  + inputAttendance + "/" + attendance + ")]");
        } else if ( result<70 ) { //70점 미만
                System.out.print("Fail");
        }else {
            System.out.println("PASS");
        }
    }
    public double showResult (int inputMid, int inputFinals, int inputAssignment, int inputAttendance){
        double mid = (double)inputMid * 20 / 100;
        double fianls = (double)inputFinals * 30 / 100;
        double assignment = (double)inputAssignment * 30 / 100;
        double attendance = (double)inputAttendance * 20 / 20;
        double sum = mid + fianls + assignment + attendance ;

        System.out.println("===========결과===========");
        System.out.println("중간고사점수(20) : " + mid);
        System.out.println("기말고사점수(30) : " + fianls);
        System.out.println("과제점수(30) : " + assignment);
        System.out.println("출석점수(20) : " + attendance);
        System.out.println("총점 : " + sum);

        return sum ;
    }
    public int beAbsent(int attendance, int inputAttendance){
        int absent = attendance - inputAttendance; //결석 회수 계산

        return absent;
    }
}
