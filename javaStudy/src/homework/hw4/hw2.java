package homework.hw4;

/*
 * @Projectname: javaStudy
 * @Filename: hw2
 * @Author: 55宾伟强
 * @Data:2023/4/19 20:08
 * @Description: 录入书店会员信息
 */
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //使用字典存储会员信息
        int[] huiYuanHao=new int[3];
        String[] huiYuanShengRi=new String[3];
        int[] huiYuanJiFen=new int[3];

        for(int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"位会员的信息:");
            System.out.print("会员号:");
            huiYuanHao[i]=input.nextInt();
            System.out.print("会员生日:");
            huiYuanShengRi[i]=input.next();
            System.out.print("会员积分:");
            huiYuanJiFen[i]=input.nextInt();
            if(huiYuanHao[i]<1000||huiYuanHao[i]>9999){
                System.out.println("会员号码不合法,录入失败");
            }else{
                System.out.print("会员号:"+huiYuanHao[i]+'\t');
                System.out.print("会员生日:"+huiYuanShengRi[i]+'\t');
                System.out.print("会员积分:"+huiYuanJiFen[i]+'\t');
                System.out.println("\n");
            }
        }
    }
}
