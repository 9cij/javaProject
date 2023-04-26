package d426;

/*
 * @Projectname: javaStudy
 * @Filename: demo1
 * @Author: 55宾伟强
 * @Data:2023/4/26 18:47
 * @Description: 循环录入java课的学生成绩,统计分数大于等于80分的学生比例
 */

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        boolean flag = false;
        double score;
        int nums = 0;
//        int cntStu = 0;
//        System.out.println("input -1 exit");
        //String name = input.nextLine();

//        do {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("plz input student" + i + "'s score:");
//                score = input.nextDouble();
//                if ((int) score == -1) {
//                    flag = true;
//                } else {
//                    cntStu++;
//                }
//                if (score >= 80) {
//                    nums++;
//                }
//            }
//        } while (!flag);
        for(int i=0;i<5;i++){
            System.out.println("plz input student" + i + "'s score:");
            score = input.nextDouble();

            if (score >= 80) {
                nums++;
            }else {
                continue;
            }

        }
        System.out.println("80分以上有:" + nums + "人");
        System.out.println("80分以上人数占比:" + (double) nums / 5 * 100 + "%");
    }
}
