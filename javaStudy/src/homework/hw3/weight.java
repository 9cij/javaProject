package homework.hw3;
/*
 * @Projectname: javaStudy
 * @Author: 65宾伟强
 * @Data:2023/3/29 21:40
 * @Description: TODO
 */
import java.util.Scanner;
public class weight {
	/*
	* 计算运费
	* */
	public static void main(String[] args) {
		float w,fee;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入旅客的行李的重量:");
		w=input.nextFloat();//以下代码为通过控制台交互输入行李数量
		if(w>20) {
			fee = (float) 1.2 * (w - 20);
		}else {
			fee = 0;
		}
		System.out.println("该旅客需交纳的托运费用:"+fee+"元");
	}
}
