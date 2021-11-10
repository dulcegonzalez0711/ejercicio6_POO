/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Javie
 */
public class Datos {
    private BufferedReader bEntrada;
    private FileReader fReader;
    private FileWriter fWriter;
    private PrintWriter pWriter;
    
    public Datos(){
        
    }
    
    public void Conexion(){
         this.bEntrada = null;
        this.fReader = null;
        this.fWriter = null;
        this.pWriter = null;
    }
    
    public String LeerDatos() throws FileNotFoundException, IOException{
        this.fReader = new FileReader("tiendas.txt");
        bEntrada = new BufferedReader(fReader);
        String datos = "";
        String linea = this.bEntrada.readLine();
        while (linea != null){
            datos += linea + "\n";
            linea = this.bEntrada.readLine();
        }
        bEntrada.close();
        return datos;
 
    }
    
    
    
}