class Camera extends Device implements MultimediaPortable {

    private String device= "Camara";

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

}

