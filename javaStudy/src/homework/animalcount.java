package homework;

/*
 * @Projectname: javaStudy
 * @Author: 65宾伟强
 * @Data:2023/3/29 21:40
 * @Description: TODO
 */
public class animalcount {
    public static void main(String[] args) {
        double chick, rabbit;
        int heads = 10, feet = 32;
        chick = (heads * 4 - feet) / 2.0;
        rabbit = heads - chick;
        if (chick == (int) chick && chick >= 0 && rabbit >= 0) {
            System.out.println("鸡有" + chick + "只");
            System.out.println("兔有" + rabbit + "只");
        } else {
            System.out.println("数据输入可能有误！");
        }
    }
}
