
import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int numTerms = scan.nextInt();
        
        System.out.println("Fibanocci Series:");
        int firstTerm = 0;
        int secondTerm = 1;
        
        for (int i = 1; i <= numTerms; ++i) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
    }
}