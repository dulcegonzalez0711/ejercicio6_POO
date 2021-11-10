class Tablet extends Device implements Portable, InternetVideos{
    private String device= "Smartphone";

    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
    public void Videos(){
        String p="Ejecutando videojuegos desde "+device; 
        System.out.print(p);
    }
    public void conectarseInternet(String link){
        String p="Conectándose a"+link+"desde"+device;
        System.out.print(p);
    }

}