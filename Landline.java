public class Landline extends Device implements Llamadas {
    
    private String device= "Landline";
    
    public void Llamar(int num){
        String p="LLamando al numero"+num+"desde"+device; 
        System.out.print(p);
}
}
