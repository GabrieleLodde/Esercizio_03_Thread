package esercizio_03_thread;
public class Fattoriale extends Thread{
    private int val;

    public Fattoriale(String nome, int val) {
        super(nome);
        this.val = val;
    }
    
    public int getVal() {
        return val;
    }
    
    public long fattoriale(int num) throws NumeroNegativo{
        if(num == 0)
            val = 1;        
        else if(num > 0)
            val = num * (int) fattoriale(num - 1);
        else
            throw new NumeroNegativo();
        return val;
    }
    
    public void run() {
        try{
            System.out.println("----Risultato Thread " + getName() + " : " + fattoriale(val) + " -----");
        }catch(NumeroNegativo e){
            System.out.println("----Impossibile effettuare il fattoriale di un numero negativo!" + "(" + getName() + ")----");
        }
    }
}