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
}
