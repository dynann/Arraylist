import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of emirp numbers to display: ");
        int n = scanner.nextInt();

        int count = 0; // Counter to track emirp numbers found
        int i = 2; // Start checking from 2 (smallest prime)

        while (count < n) {
            if (isPrime(i)) {
                int reversed = reverse(i);
                if (isPrime(reversed) && reversed != i) { // Exclude palindromic primes
                    list.add(i);
                    count++;
                }
            }
            i++;
        }

        for(int j = 0 ; j < list.size(); j++){
            System.out.print(list.get(j) + " ");

            if( (j + 1) % 10 == 0){
                System.out.println();
            }
        }
        scanner.close();
    }
}
