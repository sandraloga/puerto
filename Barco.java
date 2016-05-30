
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anioFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora , int anioFabricacion )
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public float getEslora()
    {
        return eslora;
    }

    public int getAnoFabricacion()
    {
        return anioFabricacion;

    }

    public abstract int getCoeficienteBernua();

    public String toString()
    {
        return "Matricula: " + matricula + ". Eslora: " + eslora + ". Año Fabricacion: "
        + anioFabricacion;
    }
}
