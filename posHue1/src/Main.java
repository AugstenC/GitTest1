import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quit to quit");
        String s ="";
        while (true) {
            System.out.println("Enter a limit for the number of to where the primal numbers should be reaching");
            s = sc.nextLine();
            if(s.equals("quit")) break;
            EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(Integer.parseInt(s));
            e.printPrimes();
        }
        sc.close();
    }
}