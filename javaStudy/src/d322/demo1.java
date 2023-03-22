package d322;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int benJin=0;
        int days;
        double lv;
        double benXiHeJi;

        System.out.println("请输入本金：");
        benJin = input.nextInt();
        System.out.println("请输入天数：");
        days = input.nextInt();
        System.out.println("请输入利率：");
        lv=input.nextDouble();
        benXiHeJi=benJin + benJin*lv*days/365;
        System.out.println(days+"天本息合计为："+benXiHeJi);
    }
}
