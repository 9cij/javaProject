package homework.hw3;
/*
 * @Projectname: javaStudy
 * @Author: 65宾伟强
 * @Data:2023/3/29 21:40
 * @Description: TODO
 */
import java.util.Scanner;
public class Compete2 {
    /*
    * 输出名次的奖品
    * */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the mingCi:");
        int mingCi = input.nextInt();//名次
        switch (mingCi){
            case 1:
                System.out.println("参加麻省理工学院组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一台");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("没有任何奖励");
        }
    }
}
