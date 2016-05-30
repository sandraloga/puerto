
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes, int potencia, String matricula , float eslora ,int anioFabricacion )
    {
        super(potencia,matricula,eslora,anioFabricacion);
        this.camarotes = camarotes;
    }

    /**
     *@override
     */
    public int getCoeficienteBernua()
    {

        return camarotes;
    }

    public String toString()
    {
        String texto = super.toString();
        texto += "Numero camarotes: " + camarotes;
        return texto;
    }
}
