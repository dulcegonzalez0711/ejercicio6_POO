public class Laptop extends Device implements Portable, Computador {

    private String device="Laptop";

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
    
} 

