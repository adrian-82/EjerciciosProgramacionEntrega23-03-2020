package EjerciciosProgramacion_String_Entrega23032020;

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
        Cadena cadena=new Cadena();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro Juego de encriptaci�n...esperemos se sienta agusto!");
        boolean salir=true;
        int opcion=0;
        do{
            System.out.println("---Seleccione la opci�n del juego, por favor!---");    
            opcion=0;

            try{

                opcion=teclado.nextInt();

            }catch(ArithmeticException e){

                System.out.println("...o meta un n�mero o le corto una mano");

            }

            switch(opcion){

                case 1: 
                System.out.println("Introduzca una cadena, por favor!"); 
                cadena.codificarAlAzar(teclado.nextLine()); 
                cadena.toString();                               /*conjuntoDivisores Devuelve un conjunto con todos los divisores del número.*/
                cadena.mostrarEcriptado();
                break;
                /*
                case 2:
                numero.esAmigode();                
                break;

                case 3:
                System.out.println("Inserte número para saber si es Narcisista, por favor!");
                narcisista.esNarcisista(teclado.nextInt());
                break;

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