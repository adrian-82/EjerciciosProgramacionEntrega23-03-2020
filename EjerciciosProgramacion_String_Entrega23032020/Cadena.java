package EjerciciosProgramacion_String_Entrega23032020;

import java.util.Scanner;
/**
 * Clase que nos permite codificar cadenas
 * de forma al azar y de forma determinada.
 * 
 * @author Adrián Laya García.
 * @version 22/03/2020
 */
public class Cadena
{
    private String cadenaAcodificar;
    Scanner teclado;
    private char[]caracteres;
    private String letras;
    private int numTetrita;
    private String encriptado;

    /**
     * Constructor 
     */
    public Cadena()
    {
        cadenaAcodificar="";
            encriptado="";
        letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void codificarAlAzar(String cadena)
    {
        Scanner teclado=new Scanner(System.in);

        cadenaAcodificar=teclado.nextLine();
        caracteres=cadenaAcodificar.toCharArray();

        for(int i=0; i<=caracteres.length-1; i++){
            int caracter=(int)(Math.random()*62)+1;
            caracteres[i]=letras.substring(caracter, caracter+1).charAt(0);

        }

  
    }   

    /**
    @override
     **/
    public String toString()
    {
    
       encriptado=String.valueOf(caracteres);
       
        return this.encriptado;

    }

    public void mostrarEcriptado(){

        System.out.println(toString());

    }

}
/*
Cadena 

Constructor

Permite construir una cadena con un valor inicial.
Si no se le indica nada, crea una cadena vacía.
De la siguiente forma:

codificar
Devuelve un string que es la cadena inicial codificada. 
Se van a codificar solo las letras mayúsculas y minúsculas y los números.
El resto se queda igual. Por ejemplo

Cadena cadena = new Cadena (“Navidad�?);
cadena.codificar ( )  “pERs2E2�?  (u otra cualquiera)

Lo que se ha hecho es cambiar cada letra por otra al azar

Haz otra versión en la que una letra no pueda ser cambiada por ella misma.


AYUDA
Añadir otro campo a la clase: un HashMap en el que se asigne a cada carácter otro al azar. Esto se podría hacer en el constructor de la clase.
Como un HashMap no acepta  tipos primitivos, usa el tipo Character en vez del char.
La relación de caracteres a codificar puede ser una constante de la clase.
Viene bien usar el método quitarLetraEnPosicion descrito más  adelante.

pasarADecimal Dado un número romano, devuelve su valor decimal. No distingue entre mayúsculas y minúsculas. Si el número romano no es válido, devuelve -1.  Por ejemplo

Cadena cadena1 = new Cadena (“MCMXCII�?);
cadena1.pasarADecimal ( )  1992
Cadena cadena2 = new Cadena (“NCMXCII�?); // No es un número válido (tiene una N)
cadena2.pasarADecimal ( )  -1

Por simplificar algo el ejercicio, se va a considerar un número romano como NO válido solo cuando tenga algún carácter no permitido.
Es decir, por ejemplo NCMXCII devolverá -1 por que tiene la N, pero XXMM lo entiende como bueno (aunque no lo es) y devuelve el valor que le correspondería.
quitarLetraEnPosicion Quita de un string la letra que ocupa la posición indicada. Por ejemplo

String mensaje = “Navidad�?;
quitarLetraEnPosicion (mensaje, 2);
System.out.println (mensaje);       // Visualiza “Naidad�? (sin la letra 2, la v)
quitarLetraEnPosicion (mensaje, 10);    // No da error. No hace nada

AYUDA
Éste podría ser un método privado, interesante para la codificación de la palabra.
Consulta el método substring de la clase String

quitarLetras Dada un string, devuelve otro string que es la cadena inicial a la que se le han quitado las letras de la cadena indicada.     Por ejemplo
Cadena cadena = new Cadena (“Hoy es Navidad�?);
Cadena.quitarLetras (“aeiou�?)  “Hy s Nvdd�?

AYUDA
Consulta los métodos charAt e indexOf de la clase String

repetir Dado un número N, devuelve un string que es la cadena inicial repetida N veces. Por ejemplo

Cadena cadena = new Cadena (“Pepe�?);
cadena.repetir (5)  “PepePepePepePepePepe�?

separarCon Separa los caracteres de una cadena con el carácter especificado. Si no se le indica ninguno lo hace con espacios. Por ejemplo
Cadena cadena = new Cadena (“Navidad�?);
cadena.separarCon (‘-‘)  “N-a-v-i-d-a-d�?
cadena.separarCon ( )  “N a v i d a d�? 

AYUDA
Puedes hacer que el método sin parámetros  llame al otro y ¡sale gratis!

Comprueba

Que toda la documentación del proyecto ha sido generada correctamente, las clases con sus comentarios descriptivos y los métodos con sus parámetros y sus valores devueltos
 */