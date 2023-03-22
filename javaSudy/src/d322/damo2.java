package d322;
import java.util.Scanner;
public class damo2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String name;
        double score_python,score_golang,score_java;
        System.out.println("请输入姓名：");
        name=input.nextLine();
        System.out.println("请输入python成绩：");
        score_python=input.nextDouble();
        System.out.println("请输入golang成绩：");
        score_golang=input.nextDouble();
        System.out.println("请输入java成绩：");
        score_java=input.nextDouble();
        System.out.println("姓名："+name+"平均成绩："+(score_python+score_golang+score_java)/3);

    }
}
