package d412;

/*
 * @Projectname: javaStudy
 * @Filename: demo1
 * @Author: 55宾伟强
 * @Data:2023/4/12 19:08
 * @Description: 输入一个数字输出星期几
 */
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        int day;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        day=input.nextInt();
        switch (day) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            default -> System.out.println("输入错误");
        }
    }
}
