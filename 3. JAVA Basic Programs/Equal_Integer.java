import java.util.Scanner;
public class Equal_Integer {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int m = scanner.nextInt();
System.out.print("Enter the second number: ");
int n = scanner.nextInt();
if (m == n) {
System.out.println(m + " and " + n + " are equal ");
} else {
System.out.println(m + " and " + n + " are not equal ");
}
scanner.close();
}
}
