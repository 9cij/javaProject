package homework.hw4;

/*
 * @Projectname: javaStudy
 * @Filename: hw1
 * @Author: 55宾伟强
 * @Data:2023/4/19 19:57
 * @Description: 上机练习1——计算1000以内在奇数之和（分别用三种循环语句完成）
 */
public class hw1 {
    public static void main(String[] args){
        int n=0,sum=0;
        while(n<=1000){sum+=n%2!=0?n:0; n++;}
        System.out.println(sum);

        n=0;sum=0;
        do{sum+=n%2!=0?n:0;n++;}while (n<=1000);
        System.out.println(sum);

        sum=0;
        for(n=0;n<=1000;n++){sum+=n%2==0?0:n;}
        System.out.println(sum);
    }
}
