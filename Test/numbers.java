package Test;
import java.util.Scanner;

public class numbers {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 2; i < n; i++) {
        System.out.print(i + " "); 
        for (int j = 2; j < n; j++) {
            System.out.print("  "); 
        }
        System.out.print(n - i + 1); 
        System.out.println();
    }
    for (int i = n; i >= 1; i--) {
        System.out.print(i + " ");
    }
    System.out.println();

    scanner.close();
}

}
	


	
	

		



