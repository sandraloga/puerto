import java.util.Arrays;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private static final int NUMERO_AMARRES = 4;
    private Alquiler[] alquileres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {  
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * añade un alquiler si hay amarre libre
     * si no hay posicion libre devuelve -1 y si la hay devuleve la posicion de amarre
     */
    public int addAlquiler(int numDias , Cliente cliente , Barco barco)
    {
        int control =-1;
        boolean libre= true;
        for (int i=0 ; i < alquileres.length && libre == true ; i++)
        {
            if (alquileres[i] == null)
            {
                alquileres[i] = new Alquiler(numDias,cliente,barco);
                control = i;
                libre= false;
            }
        }
        return control;
    }

    /**
     * precio del alquiler
     */
    public void verEstadoAmarre()
    {
        String text = "Todos los amarres estan libres!!!";
        for (int i = 0; i < alquileres.length ; i++)
        {
            if (alquileres[i] != null)
            {
                System.out.println(" El precio el amarre nº " + i + " es: " +
                    alquileres[i].getCosteAlquiler() + " €.");
            }
        }
        System.out.println(text);
    }

    /**
     * 
     * 
     */
    public float liquidarAlquiler(int posc)
    {
        float precioAlquiler=0;
        if (alquileres[posc]!= null){

            if (posc >= 0 && posc < alquileres.length)
            {
                precioAlquiler = alquileres[posc].getCosteAlquiler();
                //alquileres[posc] = null; //lo anula al pagarlo
            }
        }
        return precioAlquiler;
    }
}
