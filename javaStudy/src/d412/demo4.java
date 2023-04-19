package d412;

/*
 * @Projectname: javaStudy
 * @Filename: demo4
 * @Author: 55宾伟强
 * @Data:2023/4/12 20:46
 * @Description: TODO
 */

import java.util.Scanner;
public class demo4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int stuCount,sumScore=0,i;
        double avgScore;
        System.out.println("输入班级人数:");
        stuCount = input.nextInt();
        i=stuCount;
        while(i>0){
            System.out.println("输入学生的成绩:");
            sumScore+=input.nextInt();
            i--;
        }
        avgScore= (double) sumScore /stuCount;
        System.out.println(avgScore);

    }
}
