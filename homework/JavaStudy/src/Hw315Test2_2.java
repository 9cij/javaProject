import java.util.Scanner;

public class Hw315Test2_2 {
    public static void main(String[] args) {
        String sname;
        Scanner input = new Scanner(System.in);
        System.out.println("input u name:");
        sname = input.next();
        char sex='男';
        int java=90;
        int c=99;
        int eng=99;
        int sum=0;
        double avg;
        sum=java+c+eng;
        avg=sum/3;
        System.out.println("I'm "+sname+";sex="+sex+";my AVG score ="+avg+";my SUM score ="+sum);
    }
}
