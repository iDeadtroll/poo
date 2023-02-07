package Pb.calc;

/**
 *
 * @author mamisho
 */
public class Calculadora {
    
    private Double val1;
    private Double val2;
    private String oper; // + - / x
    
    public Calculadora(Integer v1, Integer v2) {
        val1 = v1.doubleValue();
        val2 = v2.doubleValue();
    }
    
    public Calculadora(String oper, String v1, String v2) {
        this.oper = oper;
        val1 = Double.parseDouble(v1);
        val2 = Double.parseDouble(v2);
    }
    
    public Calculadora(Double v1, Double v2) {
        val1 = v1;
        val2 = v2;
        oper = "^";
    }
    
    private Double sumar() {
        return val1 + val2;
    }
    
    private Double restar() {
        return val1 - val2;
    }
    
    private Double multiplicar() {
        return val1 * val2;
    }
    
    private Double dividir() {
        if(val2 != 0) {
            return val1 / val2;
        } else {
            return null;
        }
    }
    
    public void operar() {
        Double result = null;
        switch (oper) {
            case "+":
                result = sumar();
                break;
            case "-":
                result = restar();
                break;
            case "x":
                result = multiplicar();
                break;
            case "/":
                result = dividir();
                break;
            case "^":
                result = Math.pow(val1, val2);
                break;
        }
        
        this.mostrarResultado(result);
    }
    
    private void mostrarResultado(Double val) {
        System.out.println(val);
    }

    public Double getVal1() {
        return val1;
    }

    public Double getVal2() {
        return val2;
    }

    public String getOper() {
        return oper;
    }
    
    public void setOper(String nuevaOperacion) {
        this.oper = nuevaOperacion;
    }
}
