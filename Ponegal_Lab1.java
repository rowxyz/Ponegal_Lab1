public class Ponegal_Lab1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter number: ");
        // Read the integer input from the user
        int n = scanner.nextInt();
        
        // Print the top border of the pattern
        System.out.println("*");
        
        // Upper part of the pattern
        // Iterate from 1 to n (inclusive) for the rows
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        // Bottom part of the pattern
        // Iterate from n-1 down to 1 for the rows
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            
            // Print the ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print the descending numbers from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print the ending '*' and move to the next line
            System.out.println("*");
        }
        
        // Print the bottom border of the pattern
        System.out.println("*");
        
        // Close the Scanner object to free up resources
        scanner.close();
    }
}