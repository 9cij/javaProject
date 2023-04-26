package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw4
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:52
 * @Description: 1~10之间的整数相加，得到累加值大于20的当前数。
 */
public class hw4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println(i);
                break;
            }
        }
    }
}
