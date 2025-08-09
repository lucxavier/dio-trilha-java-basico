public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();


        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);


        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);



    }
}
