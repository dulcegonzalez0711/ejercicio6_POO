class SmartWatch extends Device implements FotoPort, Llamadas {
    private String device="SmartWatch";

    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
    }
    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
    public void fotos(){
        String p="Tomando fotos desde "+device; 
        System.out.print(p);
    }

}
