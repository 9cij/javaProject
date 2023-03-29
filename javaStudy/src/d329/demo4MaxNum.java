package d329;/*
 * @Projectname: javaStudy
 * @Filename: demo4MaxNum
 * @Author: 65宾伟强
 * @Data:2023/3/29 20:14
 * @Description: TODO
 */
import java.util.Scanner;
public class demo4MaxNum {
    public static void main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        a=input.nextInt();
        System.out.println("请输入第二个数：");
        b=input.nextInt();
        System.out.println("请输入第三个数：");
        c=input.nextInt();
        System.out.println("a="+a+"\tb="+b+"\tc="+c);
        System.out.println("最大值为："+Math.max(Math.max(a,b),c));
    }

}
