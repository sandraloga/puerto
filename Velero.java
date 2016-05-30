
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anioFabricacion)
    {
       super(matricula,eslora,anioFabricacion);
       this.numeroMastiles = numeroMastiles;
    }

    /**
     * @override
     */
    public int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    public String toString()
    {
        String texto = super.toString();
        texto += "Numero mastlies: " + numeroMastiles;
        return texto;
    }
    
    
}
