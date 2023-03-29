package d329;
/*
 * @Projectname: javaStudy
 * @Filename: demo3Temp
 * @Author: 65宾伟强
 * @Data:2023/3/29 19:36
 * @Description: TODO
 */

import java.util.Scanner;

public class demo3Temp {
    public static void main(String[] args) {
        float temp;
        boolean kangyuan = false;
        Scanner input = new Scanner(System.in);
        System.out.println("输入体温：");
        temp = input.nextFloat();
        if (temp >= 37.5) {
            if(kangyuan){
                System.out.println("隔离");
            }else {
                System.out.println("发烧,但不需要隔离");
            }
        } else {
            if(temp>37){
                System.out.println("注意休息,多喝热水");
            }else {
                System.out.println("正常");
            }
        }

    }
}
