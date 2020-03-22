import java.util.Scanner;  /*1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748*/
/**
 * Clase con la que interactuamos para saber si un número es Narcisista.
 * 
 * @author Adrián Laya García
 * @version (a version number or a date)
 */
public class Narcisista
{
    Scanner teclado;
    private int num;
    private String numCadena;
    private char[] lista;
    private int sumaPotencias;

    /**
     * Constructor 
     */
    public Narcisista()
    {

        num = 0;
    }

    /**
     * Método que nos devuelve si un número es Narcisista o nó,
     * 
     * @param  num, un número entero
     * @return true en caso de ser Narcisista
     * @return false en caso de no ser Narcisista.
     */
    public boolean esNarcisista(int num)
    {
        this.num=num;
        sumaPotencias=0;
        sumaPotencias(num);

        if(sumaPotencias==num){
            System.out.println("Correcto, es Narcisista");
            return true;
        }else{
            System.out.println("Incorrecto, no es Narcisista");
            return false;
        }

    }

    /**
     * Método que suma las potencias de cada digito 
     * elevado al número de digitos,
     * 
     * @param  num, un número entero
     * @return true en caso de ser Narcisista
     * @return false en caso de no ser Narcisista.
     */
    public int sumaPotencias(int num){

        Scanner teclado=new Scanner(System.in);
        numCadena=teclado.nextLine();
        lista=numCadena.toCharArray();
        /*exponente=lista.length;*/
        sumaPotencias=0;
        for(int i=0; i<=lista.length-1; i++){

            sumaPotencias=sumaPotencias +(int) Math.pow(Character.getNumericValue(lista[i]),lista.length);
            /*(int) Math.pow(base, n);*/
        }

        return sumaPotencias;

    }
}
/*
esNarcisista Devuelve VERDAD o FALSO dependiendo de si un número es narcisista o no. 
Un número de n dígitos es narcisista
si es igual a la suma de las potencias de orden n de sus dígitos.
Por ejemplo: 
Numero.esNarcisista (153 )  true // Ya que  153 = 1³ + 5³ + 3³.
getValor Devuelve el valor del número. Por ejemplo:
Numero numero = new Numero (153);
numero.getValor ( )  153

listarNarcisistas Lista todos los números 
narcisistas de un determinado número de cifras. Por ejemplo:

Numero.listarNarcisistas (3) */ 