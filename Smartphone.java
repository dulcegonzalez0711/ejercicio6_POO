


class Smartphone extends Device implements MultimediaPortable, Llamadas{
    private String device= "Smartphone";
    
    public Smartphone(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType){
        super(serialNumber, manufacturer, productionDate, markerAR, deviceType);
    }
    
    public void fotos(){
        String p="Tomando fotos desde "+device; 
        System.out.print(p);
    }
    public void videos(){
        String p="Reproduciendo videos desde "+device; 
        System.out.print(p);
    }
    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
}
    
    public void Funcionalidades(){
        String Funcionalidades = """
                                                
                                                1. Tomar foto.
                                                2. Tomar videos.
                                                3. Portable
                                                4. Llamar
                                                9. Comprar
                                                
                                """
                ;
        System.out.println(Funcionalidades);
    }
}
