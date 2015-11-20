import java.util.*;
public class main {
public static int fibR(int n) {
if (n < 2) return n;
 return fibR(n-1) + fibR(n-2); 
}
public static int fibI(int n) {
int elementA = 0; 
int elementB = 1; 
int wynik = 0;
if (n < 2) return n; 
for(int i = 2; i <= n; i++){
wynik = elementA + elementB; 
elementA = elementB; 
elementB = wynik;
}
return wynik;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print ("Ktory element ciagu Fibonacciego chcesz obliczyc: " );
int n = sc.nextInt();
System.out.println( n + "-ty element ciagu Fibonacciego (rekurencja) wynosi: " + fibR(n));
System.out.println( n + "-ty element ciagu Fibonacciego (iteracja) wynosi: " + fibI(n)); 
 }
}