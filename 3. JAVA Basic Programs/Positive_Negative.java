import java.util.Scanner;
public class Positive_Negative {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
if (n > 0) {
System.out.println(n + " is Positive");
} else if (n < 0) {
System.out.println(n + " is Negative");
} else {
System.out.println(n + " is Zero");
}
}
}
