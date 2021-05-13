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
        this.valorActual=valorIni;
    }

    public contador(int valorIni, int incremento, int valorMax){
        this.valorIni=valorIni;
        this.incremento=incremento;
        this.valorMax=valorMax;
        this.valorActual=valorIni;
    }

    public int incrementar(){
        this.valorActual=this.valorActual+this.incremento;

        if(this.valorActual>this.valorMax){
            this.valorActual=this.valorIni;
        }
        return this.valorActual;
    }

    public int getValorActualContador(){
        return this.valorActual;
    }
}
