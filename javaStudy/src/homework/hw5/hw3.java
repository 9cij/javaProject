package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw3
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:52
 * @Description: 求1~100之间不能被3整除的数之和（使用for循环结构）
 */
public class hw3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
