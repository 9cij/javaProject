public class Introduce {
    public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            switch (a) {
                case 0:
                case 3:
                    a = a + 2;
                case 1:
                case 2:
                    a = a + 3;
                    System.out.println(a);
            }
        }
    }
}