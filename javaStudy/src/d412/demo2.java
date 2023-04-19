package d412;

/*
 * @Projectname: javaStudy
 * @Filename: demo2
 * @Author: 55宾伟强
 * @Data:2023/4/12 19:10
 * @Description: switch语句 成绩等级评定
 */

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int score;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        score = input.nextInt();
//        score=90;
        switch (score / 10) {
            case 10, 9 -> System.out.println("优秀");
            case 8 -> System.out.println("良好");
            case 7 -> System.out.println("中等");
            case 6 -> System.out.println("及格");
            default -> System.out.println("不及格");
        }
    }
}
