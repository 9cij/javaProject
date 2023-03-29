package d329;
/*
 * @Projectname: javaStudy
 * @Filename: demo1
 * @Author: 65宾伟强
 * @Data:2023/3/29 18:39
 * @Description: TODO
 */

import java.util.Scanner;

public class demo1 {
    //交换两个变量的值
    public static void main(String[] args) {
        int f, s, t;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        f = input.nextInt();
        System.out.println("请输入第二个数：");
        s = input.nextInt();
        t = f; f = s; s = t;
        System.out.println("交换后的第一个数为：" + f);
        System.out.println("交换后的第二个数为：" + s);
    }
}
