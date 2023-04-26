package d419;

/*
 * @Projectname: javaStudy
 * @Filename: demo3
 * @Author: 55宾伟强
 * @Data:2023/4/19 19:25
 * @Description: TODO
 */
public class demo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 7 != 0)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
