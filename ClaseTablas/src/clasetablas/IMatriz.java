/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clasetablas;

/**
 *
 * @author developer
 */
public interface IMatriz {

    public String toString();

    public int getFilas();

    public int getColumnas();

    public void setElemento(int f, int c, double e);

    public double getElemento(int f, int c);

    public IMatriz suma(IMatriz mat);

    public boolean busca(double e);
}
