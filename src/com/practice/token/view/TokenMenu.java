package com.practice.token.view;

import com.practice.token.controller.TokenController;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenMenu {

    Scanner sc = new Scanner(System.in);
    TokenController tc = new TokenController();

    public void mainMenu(){
        //메인메뉴출력
        System.out.println("1. 지정문자열");
        System.out.println("2. 입력문자열");
        System.out.println("9. 프로그램 끝내기");
        System.out.print("메뉴 번호 : ");
        int selectNum = sc.nextInt();

        if(selectNum == 1){
            tokenMenu();
            mainMenu();
        }
        if(selectNum == 2){
            inputMenu();
            mainMenu();
        }
        if(selectNum == 9){
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public void tokenMenu(){
        String str = "J a v a P r o g r a m";

        //토큰 처리 전 글자, 토큰 처리 전 개수를 출력
        int strCount = str.length();
        System.out.println("토큰 처리 전 글자 : " + str);
        System.out.println("토큰 처리 전 개수 : " + strCount);

        //토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
        String returnStr = tc.afterToken(str);
        int returnStrCount = returnStr.length();
        System.out.println("토큰 처리 후 글자 : " + returnStr);
        System.out.println("토큰 처리 후 개수 : " + returnStrCount);
        System.out.println("모두 대문자로 변환 : " + returnStr.toUpperCase());
    }
    public void inputMenu(){
        System.out.print("문자열을 입력하세요 : ");
        sc.nextLine();
        String inputStr = sc.nextLine();
        String returnStr = tc.firstCap(inputStr);
        System.out.println("첫 글자 대문자 : " + returnStr);

        System.out.print("찾을 문자를 하나 입력하세요 : ");
        char inputChar = sc.nextLine().charAt(0);
        int returnCount = tc.findChar(inputStr, inputChar);
        System.out.println(inputChar + "문자가 들어간 개수 : " + returnCount);
    }
}
