package homework;
/*
 * @Projectname: javaStudy
 * @Author: 65宾伟强
 * @Data:2023/3/29 21:40
 * @Description: TODO
 */
import java.util.Scanner;

public interface tax {
    /*
    * 计算个人所得税
    * */
    public static void main(String[] args){
        double income,tax;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入个人收入：");
        income = input.nextDouble();
        tax = 0;
        if(income<=1800){
            System.out.println("免征个税.");
        }else if (income<=5000){
            tax = (income-1800)*0.2;
        }else if (income<=10000){
            tax = (income-5000-1800)*0.2+(income-5000)*0.35;
        }else{
            tax = (5000-1800)*0.2+(10000-5000)*0.35+(income-10000)*0.5;
        }
        System.out.println("您的个人收入所得税税额为:"+tax);
    }
}
