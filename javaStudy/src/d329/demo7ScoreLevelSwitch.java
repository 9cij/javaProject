package d329;

/*
 * @Projectname: javaStudy
 * @Filename: demo7ScoreLevelSwitch
 * @Author: 65宾伟强
 * @Data:2023/3/29 21:30
 * @Description: TODO
 */
import java.util.Scanner;
public class demo7ScoreLevelSwitch {
    public static void main(String[] args) {
        int score;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        score = input.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("输入错误");
            return;
        }

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
