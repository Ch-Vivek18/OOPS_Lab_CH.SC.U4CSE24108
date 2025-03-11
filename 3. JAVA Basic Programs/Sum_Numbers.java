import java.util.Scanner;
public class Sum_Numbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();
int a[] = new int[n];
System.out.print("Enter all the elements: ");
for (int i = 0; i < n; i++) {
a[i] = scanner.nextInt();
}
Sum_Numbers obj = new Sum_Numbers();
int x = obj.add(a, a.length, 0);
System.out.println("Sum: " + x);
}
int add(int a[], int n, int i) {
if (i < n) {
return a[i] + add(a, n, ++i);
} else {
return 0;
}
}
}
