public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartv = new SmartTv();
        
        
        smartv.diminuirVolume();
        smartv.diminuirVolume();

        System.out.println("TV Ligada?  " + smartv.ligada);

        smartv.trocarCanal(29);
        
        System.out.println("Canal Atual? : " + smartv.canal);
        
        System.out.println("Volume Atual? : " + smartv.volume);

        smartv.ligar();

        System.out.println("TV Ligada?  " + smartv.ligada);

        smartv.aumentarVolume();
    }
    
}
