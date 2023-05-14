package problema3_ampliado_poo;

/**
 *
 * @author mamisho
 */
public interface IFigura {
    /**
     * Calcula el área de la figura
     * @return 
     */
    public double calcularArea();
    
    /**
     * Calcula el perímetro de la figura
     * @return 
     */
    public double calcularPerimetro();
    
    /**
     * Devuelve el total de lados de la figura
     * @return 
     */
    public int getTotalLados();
}
