import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class pruebaContador {

    //COMPROBAR SI EXISTE LA CLASE CONTADOR
        //ESTO NO FUNCIONA
        // public void comprobarClaseContador(){
        //     try{
        //         Class.forName(contador);
        //     }catch(ClassNotFoundException e){
        //         System.out.println("Error no se ha encontrado la clase");
        //     }
        // }

        //ESTO SI FUNCIONA
    
    contador cont=new contador(1,1,10);
    

    @Test 
    public void instanciarContadorSinContenido(){
        contador con=new contador();
    }

    @Test
    public void comprobarIncrementar(){
        contador con=new contador(2,2,10);
        con.incrementar();
    }

    @Test
    public void comprobarValorLimiteVuelveAlInicial(){
        contador con=new contador(9,2,12);
        int esperado=con.incrementar();
        assertEquals(11, esperado);
    }

    @Test
    public void getValorActualContador(){
        contador con=new contador(9,2,12);
        int esperado=con.getValorActualContador();
        assertEquals(9, esperado);
    }

    @Test
    public void comprobarResetContador(){
        contador con=new contador(9,2,12);
        int esperado=con.resetValorContador();
        assertEquals(1, esperado);
    }
}
