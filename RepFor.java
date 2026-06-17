import java.util.Scanner;

public class RepFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); // Example value, replace with actual input
            
            for (int i = 0; i < n; i++) {
                System.out.println("Iteration " + i +"\n");
            }
        } // Example value, replace with actual input
    }
}