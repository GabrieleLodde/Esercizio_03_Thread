package esercizio_03_thread;
public class Esercizio_03_Thread {
    public static void main(String[] args) throws InterruptedException {
        Input I1 = new Input();
        
        int n = I1.readInt("Inserisci n: ");
        int k = I1.readInt("Inserisci k: ");
        int differenza = n-k;
        
        Fattoriale F1 = new Fattoriale("N!", n);
        Fattoriale F2 = new Fattoriale("K!", k);
        Fattoriale F3 = new Fattoriale("(N-K)!", differenza);
        
        
        F1.start();
        F2.start();
        F3.start();
        
        
        F1.join();
        F2.join();
        F3.join();
        
        int risultato_finale = F1.getVal() / (F2.getVal() * F3.getVal());
        System.out.println("Risultato finale: " + risultato_finale);
    }   
}