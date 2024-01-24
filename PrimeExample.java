public class PrimeExample {
    public static void main(String args[]) {

        int n = 17;
        int flag = 0;
        if (n == 1 || n == 0) {
            System.out.println("number is not prime ");
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println("number is not prime ");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println("number is prime ");
                }
                break;

            }
        }
    }
}