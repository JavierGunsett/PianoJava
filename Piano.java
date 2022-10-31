package PianoJava;

public class Piano extends Instrumento {
    Pedal pe;
    Tecla [] t;
    
    public Piano(){
        pe=new Pedal();
        t = new Tecla[7];
        t[0] = new Tecla("do");
        t[1] = new Tecla("re");
        t[2] = new Tecla("mi");
        t[3] = new Tecla("fa");
        t[4] = new Tecla("sol");
        t[5] = new Tecla("la");
        t[6] = new Tecla("si");
    }
    
    public String VerTipo(){
        return "Piano";
    }
    
    public String ApretarTecla(int x){
        t[x].Apretar();
        return t[x].VerNotas();
    }
    
    public void SoltarTecla(int x){
        t[x].Soltar();
    }
    
    public boolean VerEstadoTecla(int x){
        return t[x].EstaApretada();
    }
    
    public void ApretarPedal(float x){
        pe.Presionar(x);
    }
    
    public float VerEstadoPedal(){
        return pe.VerPresion();
    }
}

