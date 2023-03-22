/*
 * @Projectname: javaSudy
 * @Filename: demo2
 * @Author: 宾伟强
 * @Data:2023/3/22 19:47
 * @Description: TODO
 */

package d322;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String name;
        double score_python,score_golang,score_java;
        System.out.println("请输入姓名：");
        name=input.nextLine();
        System.out.println(name+"请输入python成绩：");
        score_python=input.nextDouble();
        System.out.println(name+"请输入golang成绩：");
        score_golang=input.nextDouble();
        System.out.println(name+"请输入java成绩：");
        score_java=input.nextDouble();
        System.out.println("姓名："+name+"\t平均成绩："+(score_python+score_golang+score_java)/3);

    }
}