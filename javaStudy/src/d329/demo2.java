package d329;/*
 * @Projectname: javaStudy
 * @Filename: demo2
 * @Author: 65宾伟强
 * @Data:2023/3/29 18:49
 * @Description: TODO
 */
import java.util.Scanner;
public class demo2 {
    //根据三角形的三条边计算三角形的面积
    public static void main(String[] args){
        double a,b,c,s,area;//a,b,c为三角形的三条边，s为半周长，area为三角形的面积
        Scanner input=new Scanner(System.in);
        System.out.println("请输入三角形的第一条边：");
        a=input.nextDouble();
        System.out.println("请输入三角形的第二条边：");
        b=input.nextDouble();
        System.out.println("请输入三角形的第三条边：");
        c=input.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("三角形的面积为："+area);
        System.out.println("三角形的周长为："+(a+b+c));
        System.out.println("三角形的高为："+(2*area/a));
    }
}
