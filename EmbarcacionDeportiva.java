
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia,String matricula, float eslora, int anioFabricacion)
    {
        super(matricula,eslora,anioFabricacion);
        this.potencia = potencia;
    }

    /**
     * @override
     */

    public int getCoeficienteBernua()
    {

        return potencia;
    }

    public String toString()
    {
        String texto = super.toString();
        texto += "Potencia: " + potencia;
        return texto;
    }
}
