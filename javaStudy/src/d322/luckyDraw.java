package d322;/*
 * @Projectname: javaStudy
 * @Filename: luckyDraw
 * @Author: 宾伟强
 * @Data:2023/3/22 21:25
 * @Description: TODO
 */
import java.util.Scanner;
public class luckyDraw {
    public static void main(String[] args){
        //购书系统抽奖规则:从控制台接收用户1的4位数的会员卡号,如果会员卡号的各位数字之和大于20,则客户为幸运客户。如有一客户的会员卡号为7568,计算7568各位数字之和
        //7+5+6+8=26,则该客户为幸运客户,否则不是幸运客户
        Scanner input=new Scanner(System.in);
        int card_number,card_number1,card_number2,card_number3,card_number4;
        System.out.println("请输入会员卡号：");
        card_number=input.nextInt();
        card_number1=card_number/1000;
        card_number2=card_number%1000/100;
        card_number3=card_number%100/10;
        card_number4=card_number%10;
        if(card_number1+card_number2+card_number3+card_number4>20){
            System.out.println("该客户为幸运客户");
        }else{
            System.out.println("该客户不是幸运客户");

        }
        System.out.println("会员卡号："+card_number+"各位数字之和："+(card_number1+card_number2+card_number3+card_number4));

    }

}
