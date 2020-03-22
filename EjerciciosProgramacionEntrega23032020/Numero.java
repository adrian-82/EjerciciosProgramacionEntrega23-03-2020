import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Numero here.
 * 
 * @author Adrián Laya García.
 * @version 22/03/2020
 */
public class Numero
{
    Scanner teclado;
    private int num;
    private int num1;
    private int num2;
    private char[] num1Chares;
    private char[] num2Chares;
    private int sumadeCharesNum1;
    private int sumadeCharesNum2;
    ArrayList<Integer>lista;
    ArrayList<Integer>lista1;
    ArrayList<Integer>lista2;
    /**
     * Constructor for objects of class Numero
     */
    public Numero()
    {
        teclado = new Scanner(System.in);
        lista=new ArrayList<>();
        num=0;
        num1=0;

    }

    /**
     * Carga en la lista todos los divisores del número.
     * 
     * @param  num, numero entero introducido por teclado
     * @return Los diferentes divisores enteros de ese número. 
     */
    public void conjuntoDivisores(int num)
    {
        this.num=num;
        for(int i=1; i<=num; i++){          /* Dado un número entero y positivo*/

            if(num%i==0){

                lista.add(i);

            }

        }
    }

    /**
     * Imprime  los divisores de un número. 
     * 
     * @param num1, numero entero 
     * @param num2, número entero
     */

    public void imprimir(){

        System.out.print("Los números divisores de " +num + " son: "); 
        Iterator<Integer> it=lista.iterator();

        while(it.hasNext()){

            System.out.print(it.next() + ", ");

        }

        System.out.println();
        System.out.println("Gracias");
    }

    /**
     * Crea la lista de divisores de cada uno de los números. 
     * 
     * @param num1, numero entero 
     * @param num2, número entero
     */

    public void listadedivisores(){                                           /*Ya tenemos los 2 listados*/
        System.out.print("Inserte el primer número, por favor: ");           /*sacamos el listado del primer array*/
        lista1=new ArrayList<>();
        conjuntoDivisores(teclado.nextInt());

        System.out.print("Inserte el segundo número, por favor: ");         /*sacamos el listado del segundo array*/
        lista2=new ArrayList<>();
        conjuntoDivisores(teclado.nextInt());

    }
                                        /*da fallo aqui*/
    public void esAmigode(){
        boolean amigo=false;
        int suma1=0;

        Iterator<Integer> it1=lista1.iterator();
        while(it1.hasNext()){

            suma1=suma1+it1.next();

        }

        int suma2=0;
        Iterator<Integer> it2=lista2.iterator();
        while(it2.hasNext()){

            suma2=suma2+it2.next();

        }

        /*separar los numeros para sumarlos*/
        num1Chares=Character.toChars(num1);
        sumadeCharesNum1=0;
        for(int b=0; b<=num1Chares.length-1; b++ ){

            sumadeCharesNum1=sumadeCharesNum1 +  Character.getNumericValue(num1Chares[b]);

        }

        num2Chares=Character.toChars(num2);
        sumadeCharesNum1=0;
        for(int c=0; c<=num2Chares.length-1; c++ ){

            sumadeCharesNum2=sumadeCharesNum2 +  Character.getNumericValue(num2Chares[c]);

        }

        if(sumadeCharesNum1==suma2 && sumadeCharesNum2==suma1){
            amigo=true;
            System.out.print("Los 2 números son amigos");
        }else{
            System.out.print("Los 2 no son números son amigos");
        }

        /*return amigo;*/
    }
}
/*
esNarcisista Devuelve VERDAD o FALSO dependiendo de si un número es narcisista o no. 
Un número de n dígitos es narcisista si es igual a la suma de las potencias de orden n de sus dígitos. Por ejemplo: 
Numero.esNarcisista (153 )  true // Ya que  153 = 1³ + 5³ + 3³.
getValor Devuelve el valor del número. Por ejemplo:
Numero numero = new Numero (153);
numero.getValor ( )  153

listarNarcisistas Lista todos los números narcisistas de un determinado número de cifras. Por ejemplo:

Numero.listarNarcisistas (3) */ 








/*esAmigoDe Dado un número entero y positivo, devuelve VERDAD o FALSO dependiendo de si son números amigos. 
Dos números amigos son dos enteros positivos a y b tales que a es la suma de los divisores propios de b, y b 
es la suma de los divisores propios de a. (la unidad se considera divisor propio, pero no lo es el mismo número).
Por ejemplo

Numero numero1 = new Numero (220);
Numero numero2 = new Numero (284);
numero1.esAmigoDe (numero2)  true*/

