class Desktop extends Device implements Computador {

    private String device= "Desktop";
    public Desktop(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType){
        super(serialNumber, manufacturer, productionDate, markerAR, deviceType);
    }
    public void Videojuegos(String juego){
        String p="Ejecutando el videojuego "+juego+"desde"+device; 
        System.out.print(p);
    }
    public void Videos(){
        String p="Ejecutando videos desde "+device; 
        System.out.print(p);
    }
    public void ConectarseInternet(String link){
        String p="Conectándose a"+link+"desde"+device;
        System.out.print(p);
    }
    
    public void Funcionalidades(){
        String Funcionalidades = """
                                                
                                                1. Videojuegos
                                                2. Tomar videos.
                                                3. ConectarseInternet
                                                9. Comprar
                                                
                                """
                ;
        System.out.println(Funcionalidades);
    }
}
