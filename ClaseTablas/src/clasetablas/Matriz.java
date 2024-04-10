package clasetablas;

/**
 *
 * @author developer
 */
public class Matriz  implements IMatriz{
    
    
    private double [][] m;
    
    public Matriz(int f, int c){
	m = new double[f][c];
    }
    
    public Matriz(int f, int c, double e){
	this(f,c);
	for (int i=0; i<m.length; i++){
	    for(int j=0; j<m[i].length; j++){
		m[i][j] = e;
	    }
	}
    }

    @Override
    public int getFilas() {
	return m.length;
    }

    @Override
    public int getColumnas() {
	return m[0].length;
    }

    @Override
    public void setElemento(int f, int c, double e) {
	m[f][c] = e; 
    }

    @Override
    public double getElemento(int f, int c) {
	return m[f][c]; 
    }

    @Override
    public IMatriz suma(IMatriz mat) {
	IMatriz res = new Matriz(getFilas(), getColumnas());
	
	for (int i=0; i<m.length; i++){
	    for (int j=0; j<m[i].length; j++){
		res.setElemento(i, j, this.getElemento(i, j) + mat.getElemento(i, j));
	    }
	}
	return res;
    }

    @Override
    public boolean busca(double e) {
	for (int i=0; i<m.length; i++){
	    for (int j=0; j<m[i].length; j++){
		if(m[i][j] == e) {
		    return true;
		}
	    }
	} 
	return false;
    }
    
}
