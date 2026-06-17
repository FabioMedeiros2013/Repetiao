import java.util.Scanner;
public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Using for-each loop to iterate over the array
        for (int i = 0; i < n; i++) {
            for (String name : names) {
                System.out.println(name + " is iteration " + i);
            }
        scanner.close();
        }
    }
}
