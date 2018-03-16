
package com.mycompany.clasemaven;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbacelofernandez
 */
public class Principal {

    
    public static void main(String[] args) {
        
         try {
            Metodos.crearRepositorio();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
