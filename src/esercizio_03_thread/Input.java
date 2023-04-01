package esercizio_03_thread;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    private Scanner sc = new Scanner(System.in);

    public int readInt(String msg) {
        int val = 0;
        boolean ok = false;
        do {
            try {
                System.out.println(msg);
                val = sc.nextInt();
                ok = true;
            } catch ( InputMismatchException ex ) {
                System.out.println("Valore non valido");
            }
            sc.nextLine();
        } while ( ! ok );
        return val;
    }
}