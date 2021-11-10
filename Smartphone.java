class Smartphone extends Device implements MultimediaPortable, Llamadas{
    private String device= "Smartphone";
    
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
}
