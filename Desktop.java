class Desktop extends Device implements Computador {

    private String device= "Desktop";

    public void Videojuegos(String juego){
        String p="Ejecutando el videojuego "+juego+"desde"+device; 
        System.out.print(p);
    }
    public void Videos(){
        String p="Ejecutando videojuegos desde "+device; 
        System.out.print(p);
    }
    public void ConectarseInternet(String link){
        String p="Conectándose a"+link+"desde"+device;
        System.out.print(p);
    }
}
