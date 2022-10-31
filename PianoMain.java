package PianoJava;


public class PianoMain {

    public static void main(String[] args) {
        Piano piano= new Piano();
        
        System.out.println(piano.VerTipo());
        for (int i=0; i<7; i++){
            System.out.println(piano.ApretarTecla(i));
        }
        
        System.out.println(piano.VerEstadoTecla(3));
              
        for (int i=0; i<7; i++){
            piano.SoltarTecla(i);
        }
        
        System.out.println(piano.VerEstadoTecla(3));
        
        piano.ApretarPedal(2);
        System.out.println(piano.VerEstadoPedal());
        
    }
    
}
