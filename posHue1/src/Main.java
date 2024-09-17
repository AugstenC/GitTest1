//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public interface PrimeSieve {
// U e b e r p r u ef t ob p ei n e Primzahl i s t ode r ni c h t .
        public static boolean isPrime(int p){
            if(p == 0||p == 1 || p == 2){
                return true;
            }
            for(int i = 2; i <= Math.sqrt(p); i++){
                if(p % i == 0){
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
// Gibt a l l e Primzahlen b i s zu r Obergrenze auf de r Konsole aus .
        public void printPrimes();
    }
}