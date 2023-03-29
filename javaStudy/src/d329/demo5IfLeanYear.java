package d329;/*
 * @Projectname: javaStudy
 * @Filename: demo5IfLeanYear
 * @Author: 65宾伟强
 * @Data:2023/3/29 20:40
 * @Description: 判断是否为闰年
 */

import java.util.Scanner;

public class demo5IfLeanYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = input.nextInt();
        if (year%4==0&&year%100!=0||year%400==0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
