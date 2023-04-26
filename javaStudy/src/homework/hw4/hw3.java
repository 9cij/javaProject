package homework.hw4;

import java.util.Scanner;

/*
 * @Projectname: javaStudy
 * @Filename: hw3
 * @Author: 55宾伟强
 * @Data:2023/4/19 20:27
 * @Description: 验证用户登录信息
 */
public class hw3 {
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
        String key="key";
        String password="123456";
        int count=0;
        while(count<3){
            System.out.print("请输入用户名:");
            String username=input.next();
            System.out.print("请输入密码:");
            String pwd=input.next();
            if(username.equals(key)&&pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败");
                count++;
            }
        }
        if(count==3){
            System.out.println("登录失败,请重新启动程序");
        }
    }
}
