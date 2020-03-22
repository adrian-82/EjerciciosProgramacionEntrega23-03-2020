package EjerciciosProgramacionEntrega23032020;

import java.util.Scanner;
import java.lang.ArithmeticException;
/**
 * Empieza el juego desde un menú en el que interactúa el usuario.
 * 
 * @author Adrián Laya García.
 * @version 21/03/2020
 */
public class Main
{

    public static void main(String[]args){
        Numero numero=new Numero();
        Narcisista narcisista=new Narcisista();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro Juego con los números...esperemos se sienta agusto!");
        boolean salir=true;
        int opcion=0;
        do{
            System.out.println("---Seleccione la opción del juego, por favor!---");    
            opcion=0;

            try{

                opcion=teclado.nextInt();

            }catch(ArithmeticException e){

                System.out.println("...o mete un número o le corto una mano");

            }

            switch(opcion){

                case 1: 
                System.out.println("Introduzca un número, por favor!"); 
                numero.conjuntoDivisores(teclado.nextInt());                                          /*conjuntoDivisores Devuelve un conjunto con todos los divisores del número.*/
                numero.imprimir();
                break;

                case 2:
                numero.esAmigode();                
                break;
                
                case 3:
                System.out.println("Inserte número para saber si es Narcisista, por favor!");
                narcisista.esNarcisista(teclado.nextInt());
                break;
/*
                case 4:
                listarNarcisistas();
                break;

                case 5:
                pasarARomano();
                break;

                case 6:
                salir=false;
                break;

                default:
                break;
                 */
            }

            salir=true;
        }while(salir=false);
    }
}
/*Número 

Constructor

Permite construir un número a partir de un valor dado. 

conjuntoDivisores Devuelve un conjunto con todos los divisores del número.

esAmigoDe Dado un número entero y positivo, devuelve VERDAD o FALSO dependiendo de si son números amigos. 
Dos números amigos son dos enteros positivos a y b tales que a es la suma de los divisores propios de b, y b 
es la suma de los divisores propios de a. (la unidad se considera divisor propio, pero no lo es el mismo número).
Por ejemplo

Numero numero1 = new Numero (220);
Numero numero2 = new Numero (284);
numero1.esAmigoDe (numero2)  true

esNarcisista Devuelve VERDAD o FALSO dependiendo de si un número es narcisista o no. Un número de n dígitos es narcisista si es igual a la suma de las potencias de orden n de sus dígitos. Por ejemplo: 
Numero.esNarcisista (153 )  true // Ya que  153 = 1³ + 5³ + 3³.
getValor Devuelve el valor del número. Por ejemplo:
Numero numero = new Numero (153);
numero.getValor ( )  153

listarNarcisistas Lista todos los números narcisistas de un determinado número de cifras. Por ejemplo:

Numero.listarNarcisistas (3)  

pasarARomano Pasa un número (entre 1 y 4000) a números romanos. 
Por ejemplo:    Numero numero = new Numero (2011);
numero.pasarARomano ( )  “MMXI�?

AYUDA
Usa un arreglo con todos los posibles valores: 1000,  900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
Otro con todos los posibles símbolos: M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
Utiliza la función repetir de la clase Cadena
Utiliza el método currentTimeMillis de la clase System*/