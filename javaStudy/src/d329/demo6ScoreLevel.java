package d329;

/*
 * @Projectname: javaStudy
 * @Filename: demo6ScoreLevel
 * @Author: 65宾伟强
 * @Data:2023/3/29 20:56
 * @Description: TODO
 */

import java.util.Scanner;
public class demo6ScoreLevel {
public static void main(String[] args) {
        double score;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        score = input.nextDouble();
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

}
