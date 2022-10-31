package PianoJava;


public class Tecla {
    boolean apretada=false;
    String tecla;
    
    public Tecla(String t){
        tecla = t;
    }
    
    public String VerNotas(){
        return tecla;
    }
    
    public void Apretar(){
        apretada = true;
    }
    
    public void Soltar(){
        apretada = false;
    }
    
    public boolean EstaApretada(){
        return apretada;
    }
}
