import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit for the number of to where the primal numbers should be reaching");
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(Integer.parseInt(sc.nextLine()));
        e.printPrimes();
        sc.close();
    }
}