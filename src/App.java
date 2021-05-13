import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
    }
}

class contador{
    final private int valorIni;
    final private int incremento;
    final private int valorMax;
    private int valorActual;

    public contador(){
        this.valorIni=0;
        this.incremento=1;
        //asigno 10 por defecto
        this.valorMax=10;
    }

    public contador(int valorIni, int incremento, int valorMax){
        this.valorIni=valorIni;
        this.incremento=incremento;
        this.valorMax=valorMax;

    }

    
}
