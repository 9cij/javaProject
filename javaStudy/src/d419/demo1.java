package d419;

/*
 * @Projectname: javaStudy
 * @Filename: demo1
 * @Author: 55宾伟强
 * @Data:2023/4/19 18:34
 * @Description: do while test
 */
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args){
        int i=1;
        String sname;
        Scanner input=new Scanner(System.in);
        do{
            System.out.print("input u name:");
            sname=input.next();
        }while(!sname.equals("q"));
        System.out.println("exit!");
    }
}
