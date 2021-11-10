
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Javie
 */
public class ElectronicaLatinoamericana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarritoCompras carrito = new CarritoCompras();
        Device camera = new Camera("6438", "Sony", "21/11/2021", "MARKER", "Camara");
        Device desktop = new Desktop("6438", "Sony", "21/11/2021", "MARKER", "Computadora Desktop");
        Device laptop = new Laptop("6438", "Sony", "21/11/2021", "MARKER", "Computadora Laptop");
        Device mobile = new Mobile("6438", "Sony", "21/11/2021", "MARKER", "Telefono movil");
        Device smartphone = new Smartphone("6438", "Sony", "21/11/2021", "MARKER", "Smartphone");
        Device lineaFija = new Landline("6438", "Sony", "21/11/2021", "MARKER", "Linea Fija");
        
        ArrayList<Device> dispositivos = new ArrayList<>(Arrays.asList(camera, desktop, laptop, mobile, smartphone, lineaFija));
        
        Vista vista = new Vista();
       
        vista.MensajeBienvenida();
        String error = vista.RecibirString();
        
        int s = 0;
        while (s!= 10){
            
            System.out.println("\nDISPOTIVOS DISPONIBLES PARA TU COMPRA, VAQUERO:\n");
        System.out.println("\nIngresa el numero del cual te gustaria probar. (INGRESE 10 PARA SALIR)");
       
        for (int b = 0; b < dispositivos.size(); b++){
            
            System.out.println( (b+1)+". " + dispositivos.get(b).getDeviceType() + "\n");
        }
        
        int opcion = vista.RecibirInt();
        dispositivos.get(opcion -1).Funcionalidades();
        System.out.println("\nSELECCIONA LA FUNCIONALIDAD QUE QUIERES PROBAR");
        System.out.println(dispositivos.get(opcion -1).getDeviceType());
        dispositivos.get(opcion -1).Funcionalidades();
        int opcion2 = vista.RecibirInt();
        if (opcion2 == 9){
            carrito.AñadirAlCarrito(dispositivos.get(opcion-1));
        }
      
        
            
        }
       
    }
    
}
