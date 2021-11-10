public class Laptop extends Device implements Portable, Computador {

    private String device="Laptop";
    public Laptop(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType){
        super(serialNumber, manufacturer, productionDate, markerAR, deviceType);
    }
    public void Videojuegos(String juego){
        String p="Ejecutando el videojuego "+juego+"desde"+device; 
        System.out.print(p);
    }
    public void Videos(){
        String p="Reproduciendo videos desde "+device; 
        System.out.print(p);
    }
    public void ConectarseInternet(String link){
        String p="Conectándose a"+link+"desde"+device;
        System.out.print(p);
    }        

    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
    public void Funcionalidades(){
        String Funcionalidades = """
                                                
                                                1. Videojuegos
                                                2. Tomar videos.
                                                3. Internet
                                                4. Portable
                                                9. Comprar
                                                
                                """
                ;
        System.out.println(Funcionalidades);
    }
    
} 

