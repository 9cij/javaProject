package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw6
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:54
 * @Description: 编写程序从键盘输入不定数量的正整数。如果输入为负数就忽略掉，输入为0表示已输入完毕。然后显示输入的数值的个数和它们的平均值。
 */
public class hw6 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int num = 0;
        do {
            num = new java.util.Scanner(System.in).nextInt();
            if (num > 0) {
                count++;
                sum += num;
            }
        } while (num != 0);
        System.out.println("输入的数值的个数为：" + count);
        System.out.println("输入的数值的平均值为：" + (sum / count));
    }
}
