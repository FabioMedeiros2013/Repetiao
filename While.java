import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        
        // Using for-each loop to iterate over the array
        while (n > 0) {
            System.out.println(" While iteration " + n);
            n--;
        }
        scanner.close();
        }
    }
