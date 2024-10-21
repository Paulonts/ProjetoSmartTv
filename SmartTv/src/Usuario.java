public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A SmartTv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal); 
        System.out.println("Volume atual: " + smartTv.volume); 
        System.out.println(" "); 


        
        smartTv.ligar();
        System.out.println("novo status -> SmartTv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> SmartTv Ligada? " + smartTv.ligada);
        System.out.println(" "); 



        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume); 
        System.out.println(" "); 



        System.out.println("Canal atual: " + smartTv.canal); 
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal); 

    }
    
}
