package principal;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        PantallaPrincipal pp = new PantallaPrincipal();
        try {
            pp.mostrarOpciones();
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
