package d329;/*
 * @Projectname: javaStudy
 * @Filename: demo2Triangle
 * @Author: 65宾伟强
 * @Data:2023/3/29 18:49
 * @Description: 根据三角形的三条边计算三角形的面积
 */

import java.util.Scanner;

public class demo2Triangle {
    public static void main(String[] args) {
        double a, b, c, s, area;//a,b,c为三角形的三条边，s为半周长，area为三角形的面积
        char retry;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的第一条边：");
        a = input.nextDouble();
        System.out.println("请输入三角形的第二条边：");
        b = input.nextDouble();
        System.out.println("请输入三角形的第三条边：");
        c = input.nextDouble();

        if (!isTriangle(a, b, c)) {
            System.out.println("输入的三条边不能构成三角形！");
            System.out.println("是否重新输入？(y/n)");
            retry = input.next().charAt(0);
            if (retry == 'y') {
                main(args);
            }
            //return;
        }
        company(a, b, c);

    }

    public static boolean isTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static void company(double a, double b, double c) {
        double s,area;
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("三角形的面积为：" + area);
        System.out.println("三角形的周长为：" + (a + b + c));
        System.out.println("三角形的高为：" + (2 * area / a));
    }
}
