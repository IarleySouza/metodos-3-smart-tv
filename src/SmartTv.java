public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }
    public void diminuiVolume(){
        volume--;
    }
    public void ligar(){
        ligado = true;
    }
    public void desligado(){
        ligado = false;
    }
}
