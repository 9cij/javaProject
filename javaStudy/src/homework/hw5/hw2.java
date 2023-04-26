package homework.hw5;

/*
 * @Projectname: javaStudy
 * @Filename: hw2
 * @Author: 55宾伟强
 * @Data:2023/4/26 19:51
 * @Description: 使用do-while实现：输出摄氏温度与华氏温度的对照表，要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
 */
public class hw2 {
    public static void main(String[] args) {
        int c = 0;
        do {
            System.out.println(c + "℃" + "----->" + (9.0 / 5 * c + 32) + "℉");
            c += 20;
        } while (c <= 250);
    }
}
