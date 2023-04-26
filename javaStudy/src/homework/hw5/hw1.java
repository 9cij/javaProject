package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw1
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:48
 * @Description: 用while实现：2006年培养学员8万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到20万人？
 */
public class hw1 {
    public static void main(String[] args) {
        int year = 2006;
        int num = 80000;
        while (num <= 200000) {
            num *= 1.25;
            year++;
        }
        System.out.println(year);
    }

}
