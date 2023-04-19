package d412;

/*
 * @Projectname: javaStudy
 * @Filename: demo5
 * @Author: 55宾伟强
 * @Data:2023/4/12 21:19
 * @Description: TODO
 */

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        int stuCount = 5, pythonScore, javaScore, mathScore;
        double stuAveScore;
        double[] stuAvgScoreList = new double[stuCount];

        int i = 1;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("输入第" + i + "个学生的python成绩：");
            pythonScore = input.nextInt();
            System.out.println("输入第" + i + "个学生的java成绩：");
            javaScore = input.nextInt();
            System.out.println("输入第" + i + "个学生的math成绩：");
            mathScore = input.nextInt();
            stuAveScore = (double) (pythonScore + javaScore + mathScore) / 3;
            stuAvgScoreList[i - 1] = (double) stuAveScore;
//            System.out.println("第"+i+"个学生的平均成绩为："+stuAveScore);
            i++;
        }
        while (stuCount >= i) ;

        while (stuCount > 0) {
            System.out.println("第" + stuCount + "个学生的平均成绩为：" + stuAvgScoreList[stuCount - 1]);
            stuCount--;
        }

    }

}
