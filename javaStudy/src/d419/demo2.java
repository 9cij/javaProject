package d419;

/*
 * @Projectname: javaStudy
 * @Filename: demo2
 * @Author: 55宾伟强
 * @Data:2023/4/19 18:53
 * @Description: TODO
 */

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int s = 1;
        int n;
        float sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("input n:");
        n = input.nextInt();
        do {
            System.out.println(1+ "/"+ s + "="+(float)1/s);
            sum += (float) 1 / s;
            s++;
        } while (s<=n);
        System.out.print("sum=" + sum);
    }
}
