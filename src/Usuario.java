public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);
        System.out.println("Novo Volume: " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligado);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligado);

    }

}
