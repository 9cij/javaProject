package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw7
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:56
 * @Description: 字符界面菜单程序：要求程序显示一个菜单，然后让用户选择。如果选择0，则退出；如果选择其他，则显示选择项，并重新开始选择。
 */
public class hw7 {
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("1.显示所有学生信息");
            System.out.println("2.添加学生信息");
            System.out.println("3.删除学生信息");
            System.out.println("4.修改学生信息");
            System.out.println("0.退出");
            System.out.println("请输入你的选择：");
            choice = new java.util.Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("显示所有学生信息");
                    break;
                case 2:
                    System.out.println("添加学生信息");
                    break;
                case 3:
                    System.out.println("删除学生信息");
                    break;
                case 4:
                    System.out.println("修改学生信息");
                    break;
                case 0:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        } while (choice != 0);
    }
}
