package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw5
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:54
 * @Description: 求1~10之间的所有偶数和。
 */
public class hw5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
