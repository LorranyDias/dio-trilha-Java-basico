public class SmartTv {
    boolean ligado=false;
    int canal=1;
    int volume = 25;
    public void mudarCanal(int novoCanal){
       canal = novoCanal; 
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarvolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1;
        
    }


    public void diminuirvolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }


    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        ligado=false;
    }
}