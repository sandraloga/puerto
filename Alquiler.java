
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numeroDias, Cliente cliente, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;

    }

    /**
     * 
     */
    public String toString()
    {
        return "Numero de dias: " + numeroDias + ". Cliente: " + cliente +
        " .Barco : " + barco;

    }

    public float getCosteAlquiler()
    {
        float costeAlquiler =(numeroDias*(MULTIPLICADOR_ESLORA*barco.getEslora()))
            + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
        return costeAlquiler;
    }

}
