public class Landline extends Device implements Llamadas {
    
    private String device= "Landline";
    public Landline(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType){
        super(serialNumber, manufacturer, productionDate, markerAR, deviceType);
    }
    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
}
    
    public void Funcionalidades(){
        String Funcionalidades = """
                                                
                                                1. LLamar
                                                9. Comprar
                                                
                                """
                ;
        System.out.println(Funcionalidades);
    }
}
