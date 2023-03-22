package d322;/*
 * @Projectname: javaStudy
 * @Filename: hw_company
 * @Author: 宾伟强
 * @Data:2023/3/22 21:13
 * @Description: TODO
 */

public class demo5 {
    int x=5,y=7,z=0;
    public static void main(String[] args){
        demo5 hw=new demo5();
        int x=hw.getX(),y=hw.getY(),z=hw.getZ();
        z=x++ * y++;
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
        x=hw.getX();y=hw.getY();z=hw.getZ();
        z=++x-y--;
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
        x=hw.getX();y=hw.getY();z=hw.getZ();
        z=x++ *4/ y++;
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
        x=hw.getX();y=hw.getY();z=hw.getZ();
        z=x++ + ++y;
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
        x=hw.getX();y=hw.getY();z=hw.getZ();
        z= y++ - --x;
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
