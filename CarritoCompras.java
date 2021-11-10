/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Javie
 */
public class CarritoCompras {
    
    ArrayList<Device> compras = new ArrayList<>();
    
    public ArrayList<Device> getCompras(){
        return compras;
    }
    
    public void AñadirAlCarrito(Device device){
        compras.add(device);
        System.out.println(device.getDeviceType() +  " ha sido añadido al carrito de compras.");
    }
    
    public String toStringCarritoCompras(){
        String carritoCompras = "\n\nCARRITO DE COMPRAS:\n";
        for (int a = 0; a < compras.size(); a++){
            carritoCompras +=  a + ". "+ compras.get(a).getDeviceType() + "\n";
            
    }
        return carritoCompras;
        
    }
    
    
}

