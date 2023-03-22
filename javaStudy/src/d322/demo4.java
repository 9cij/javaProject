package d322;/*
 * @Projectname: javaStudy
 * @Filename: demo4
 * @Author: 宾伟强
 * @Data:2023/3/22 20:51
 * @Description: TODO
 */
import java.util.Scanner;
public class demo4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x,y,z;
        System.out.println("请输入x的值：");
        x=input.nextInt();
        y=x>5?x+1:-x;
        z=y>x?y:5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }
}
