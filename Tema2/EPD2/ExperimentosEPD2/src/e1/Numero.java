
/**
 * Clase sencilla para envolver reales como objetos.
 *
 * @author Raúl Giráldez
 * @version 1.0
 */
public class Numero {

    /**
     * Atributo que almacena el número.
     */
    private double n;

    /**
     * Constructor por defecto. Inicializa el número a cero.
     */
    public Numero() {
        this.n = 0.0;
    }

    /**
     * Constructor con parámetro.
     *
     * @param n número que inicializará el objeto.
     */
    public Numero(double n) {
        this.n = n;
    }

    /**
     * @return el valor del numero
     */
    public double getN() {
        return n;
    }

    /**
     * @param n nuevo valor del número que se establecerá
     */
    public void setN(double n) {
        this.n = n;
    }

    /**
     * Suma el numero que recibe como parámetro al número que ejecuta el método.
     *
     * @param num Objeto de tipo Numero.
     * @return nuevo objeto de tipo Numero con la suma del parámetro y el número
     * que llama al método.
     */
    public Numero suma(Numero num) {
        Numero out = new Numero(num.getN() + n);
        return out;
    }
}
