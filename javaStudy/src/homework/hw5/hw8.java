package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw8
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:58
 * @Description: 输出由*号组成的等腰三角形。（行数由用户从键盘上输入）
 */

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        int row = new Scanner(System.in).nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
