package d412;

/*
 * @Projectname: javaStudy
 * @Filename: demo3
 * @Author: 55宾伟强
 * @Data:2023/4/12 19:38
 * @Description: while循环实现1到100的偶数之和
 */
public class demo3 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while (i<=100){
            if (i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }


}
