package PianoJava;


public class Pedal {
    float presion;
    
    public Pedal(){
        presion = 0;
    }
    
    public void Presionar(float p){
        presion = p;
    }
    
    public float VerPresion(){
        return presion;
    }
}
