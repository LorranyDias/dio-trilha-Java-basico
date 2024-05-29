public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarvolume();
        
        System.out.println("Canal Atual : " + smartTv.canal);
        
        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);



        System.out.println("TV Ligada ? " + smartTv.ligado);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligado);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligado);
    }
}
