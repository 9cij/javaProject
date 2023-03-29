package d322;/*
 * @Projectname: javaStudy
 * @Filename: hw0322CompanySalary
 * @Author: 宾伟强
 * @Data:2023/3/22 20:05
 * @Description: TODO
 */
import java.util.Scanner;

public class hw0322CompanySalary {
    /*书店为员工提供了基本工资、物价津贴及房租津贴。其中，物价津贴为基本工资的30%,房租津贴为基本工资的20%。要求:从控制台输人基本工资,并计算输出实领工资*/
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double basic_salary,allowance,rent_allowance,real_salary;
        System.out.println("请输入基本工资：");
        basic_salary=input.nextInt();
        allowance=basic_salary*0.3;
        rent_allowance=basic_salary*0.2;
        real_salary=basic_salary+allowance+rent_allowance;
        System.out.println("基本工资："+basic_salary);
        System.out.println("物价津贴："+allowance);
        System.out.println("房租津贴："+rent_allowance);
        System.out.println("实领工资："+real_salary);

    }

}
