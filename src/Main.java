public class Main {
        public static void main(String[] args) {
            int balance = 500;
            int refill = 1_000;
            int bonus = refill/100;
            int total = balance + refill + bonus;
            if (refill >= 1000) {
            System.out.println(total);
            } else  {
                System.out.println(balance + refill);
            }
        }
}


