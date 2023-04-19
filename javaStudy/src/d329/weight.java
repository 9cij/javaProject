/*�δ��3.5�ϻ���ϰ2.2*/
package d329;
import java.util.Scanner;
public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float w,fee;
		Scanner input=new Scanner(System.in);
		System.out.println("�������ÿ͵�����������");
		w=input.nextFloat();
		fee=0;
		if(w>20)
			fee=(float)1.2*(w-20);
		System.out.println("���ÿ��轻�ɵ����˷��ã�"+fee+"Ԫ");
	}

}
