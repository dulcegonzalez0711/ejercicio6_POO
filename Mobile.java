class Mobile extends Device implements Llamadas, Portable {

    private String device= "celular"; 
    public Mobile(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType){
        super(serialNumber, manufacturer, productionDate, markerAR, deviceType);
    }
    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
    }
    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
    public void Funcionalidades(){
        String Funcionalidades = """
                                                
                                                1. Llamar
                                                2. Portable
                                                9. Comprar
                                                
                                """
                ;
        System.out.println(Funcionalidades);
    }
}
