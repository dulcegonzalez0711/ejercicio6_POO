class Mobile extends Device implements Llamadas, Portable {

    private String device= "celular"; 

    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
    }
    public void portable(){
        String p="El dispositivo"+device+"es portable."; 
        System.out.print(p);
    }
}
