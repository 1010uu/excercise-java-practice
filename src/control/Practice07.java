package control;

import java.util.Scanner;

public class Practice07 {
    public void practice07() {

        Scanner sc = new Scanner(System.in);
        System.out.print("키(m)를 입력해주세요 : ");
        double height = sc.nextDouble();

        System.out.print("몸무게(kg)를 입력해주세요 : ");
        double weight = sc.nextDouble();

        double bmi = execute(height, weight);
        System.out.println("BMI 지수 : " + bmi );

        if(bmi < 18.5){
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi < 25) {
            System.out.println("과체중");
        }else if (bmi < 30) {
            System.out.println("과체중");
        }
        else {
            System.out.println("고도비만");
        }
    }
    public double execute(double height, double weight){
        //BMI = 몸무게 / (키 * 키)
        return weight / (height * height);
    }
}
