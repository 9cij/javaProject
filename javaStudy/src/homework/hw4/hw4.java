package homework.hw4;

/*
 * @Projectname: javaStudy
 * @Filename: hw4
 * @Author: 55宾伟强
 * @Data:2023/4/19 20:39
 * @Description: 在控制台输出由*号组成在直接三角形和九九乘法表
 */
public class hw4 {
public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    //三、心得体会（老师最喜欢看这一栏）
    //

}
