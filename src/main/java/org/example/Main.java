package org.example;
import java.util.Random;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Integer tamanoCulebra=3;
        Integer tamanoTerrenoAncho;
        Integer tamanoTerrenoAlto;
        Integer ancho = 16;
        Integer alto = 16;

        Scanner leer = new Scanner(System.in);

        System.out.println("......... Snake .........");
        System.out.println("Digita el tamaño del terreno Alto: ");

        tamanoTerrenoAlto = leer.nextInt();

        System.out.println("Digita el Tamaño del terreno Ancho: ");

        tamanoTerrenoAncho = leer.nextInt();



        if(tamanoTerrenoAncho <= ancho && tamanoTerrenoAlto <=alto){

            System.out.println("Tamaño de terreno correcto");

            System.out.println("1. Comer");
            System.out.println("2. Salir");
            int opcion;


            do {

                System.out.println("Digite una opcion: ");
                opcion = leer.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Comiendo");
                        tamanoCulebra++;

                        System.out.println("el tamaño de la culebra es: "+tamanoCulebra);
                        if (tamanoCulebra >= tamanoTerrenoAlto && tamanoCulebra >= tamanoTerrenoAncho) {

                            System.out.println("Perdio");


                        }

                        break;

                    case 2:
                        System.out.println("Saliendo");


                        break;

                    default:
                        System.out.println("opcoin invalida");
                        break;
                }


            }while(opcion != 2);


        }else{

            System.out.println("Tamaño incorrecto");

        }



    }
}