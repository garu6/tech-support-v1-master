import java.util.Random;
import java.util.ArrayList;



/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    
    private Random aleatorio;
    private ArrayList<String> frases;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        frases = new ArrayList<String>();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        
        frases.add("cuentenos su problema señor");
        frases.add("Le pondremos en contacto con un especialista");
        frases.add("tenga paciencia señor estamos saturados en este momento");
        frases.add("Señor esta usted siendo borde conmigo, respeteme por favor");
        frases.add("Le paso con mi superior que tenga un buen dia :) ");
        int numero = aleatorio.nextInt(frases.size()+1);
        String resultado = frases.get(numero);
        return resultado;
    }
}
