/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Javie
 */
public class Vista {
    
    Scanner scanner = new Scanner(System.in);
    public void Menu(){
        String menu_principal = """
                                                
                                                1. Crear nuevo POST
                                                2. Buscar POST por fecha
                                                3. Buscar POST por Hashtag
                                                4. Salir de QueOndaMucha :((
                                                
                                """
                ;
        System.out.println(menu_principal);
        
    }
    
    public int RecibirInt(){
        int a = scanner.nextInt();
        return a;
    }
    
    public String RecibirString(){
        String string = scanner.nextLine();
        return string;
    }
    
    public void MensajeBienvenida(){
        String electronica = "   __ _           _                   _                                         \n" +
"  /__\\ | ___  ___| |_ _ __ ___  _ __ (_) ___ __ _                               \n" +
" /_\\ | |/ _ \\/ __| __| '__/ _ \\| '_ \\| |/ __/ _` |                              \n" +
"//__ | |  __/ (__| |_| | | (_) | | | | | (_| (_| |                              \n" +
"\\__/ |_|\\___|\\___|\\__|_|  \\___/|_| |_|_|\\___\\__,_|                              \n" +
"                                                                                \n" +
"   __       _   _                                       _                       \n" +
"  / /  __ _| |_(_)_ __   ___   __ _ _ __ ___   ___ _ __(_) ___ __ _ _ __   __ _ \n" +
" / /  / _` | __| | '_ \\ / _ \\ / _` | '_ ` _ \\ / _ \\ '__| |/ __/ _` | '_ \\ / _` |\n" +
"/ /__| (_| | |_| | | | | (_) | (_| | | | | | |  __/ |  | | (_| (_| | | | | (_| |\n" +
"\\____/\\__,_|\\__|_|_| |_|\\___/ \\__,_|_| |_| |_|\\___|_|  |_|\\___\\__,_|_| |_|\\__,_|\n" +
"                                                                                ";
        
        System.out.println(electronica);
        
        
        System.out.println("\n\nPRESIONE ENTER PARA CAER EN LA TRAMPA DEL CONSUMISMO. :)");
    }
    
    
}
