package control;

import java.util.Scanner;

public class Practice06 {
    public void practice06(){

        //관리자 : 회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성
        //회원 : 게시글작성, 게시글조회, 댓글작성
        //비회원 : 게시글조회
        Scanner sc = new Scanner(System.in);
        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String input = sc.nextLine();

        switch(input) {
            case "관리자" :
                System.out.print("회원관리,");
            case "회원" :
                System.out.print("게시글 관리, 게시글 작성, 댓글 작성,");
            case "비회원" :
                System.out.print("게시글 조회,");
        }
    }
}
