public class Pay2 {
    public static void main(String[] args) {
        //某读者的购书清单
        //在Pay1.java文件中声明变量存储信息,如图书价格,数量,折扣等
        //计算总金额,总金额为书的总价和折扣的乘积
        //结算时用户支付100元,打印购物小票
        //计算此次购书获得的会员积分(每消费10元即可获得3分)

        //声明变量
        double price1 = 10.0;
        double price2 = 20.0;
        double price3 = 30.0;
        int num1 = 2;
        int num2 = 1;
        int num3 = 1;
        double discount = 0.95;

        //计算总金额
        double total1 = calcTotal(price1, num1, discount);
        double total2 = calcTotal(price2, num2, discount);
        double total3 = calcTotal(price3, num3, discount);
        double total = total1 + total2 + total3;

        //打印清单
        System.out.println("图书清单");
        System.out.println("书名\t\t单价\t\t数量\t折扣\t\t总价");
        System.out.println("Java\t" + price1 + "\t" + num1 + "\t" + discount + "\t" + total1);
        System.out.println("python\t" + price2 + "\t" + num2 + "\t" + discount + "\t" + total2);
        System.out.println("go\t\t" + price3 + "\t" + num3 + "\t" + discount + "\t" + total3);
        System.out.println("总金额\t\t\t\t\t\t" + total + "元");

        //结算
        double pay = 100.0;
        double change = pay - total;
        System.out.println("结算");

        //打印小票
        System.out.println("购物小票");
        System.out.println("折扣:\t8折");
        System.out.println("总金额:\t" + total + "元");
        System.out.println("实收:\t" + pay + "元");
        System.out.println("找零:\t" + change + "元");
        System.out.println("本次购物所得积分是:" + (int) (total / 10) * 3);
    }

    //计算类
    private static double calcTotal(double price, int num, double discount) {
        return price * num * discount;
    }
}
