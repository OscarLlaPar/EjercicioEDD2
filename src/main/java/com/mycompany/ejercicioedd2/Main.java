/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd2;

import java.util.Scanner;

/**
 *
 * @author Óscar Llamas Parra
 * We ask the user for a series of data per screen an finally we show them.
 */
public class Main {
    
    private static int age;//Edad del alumno
    private static float averageMark;//Nota media del alumno
    private static String name;//Nombre del alumno
    private static String questionAge = "Indique su edad a continuación";
    //Preguntar edad
    private static String questionAverageMark = "Indique su nota media a continuación";
     //Preguntar nota media
    private static String questionName = "Indique su nombre a continuación";
     //Preguntar nombre
    
    /**
     * @param args the command line arguments
     * 
     * Un "warning" es una indicación que da el programa para indicaar que hay
     * algo en el código que no daría error pero que se puede escribir mejor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * ¿Qué utilidades le estás viendo hasta ahora a usar un entorno para 
         * desarrollar los programas?
         * Principalmente la rapidez, a diferencia de NotePad, el IDE te comunica
         * los errores al instante de escribir el código. Luego da más
         * facilidades como los paquetes predefinidos y diferentes plantillas
         * para crear proyectos.
         */
        // Alt+Enter para ver recomendaciones
       
         
        System.out.println(questionAge);
        Scanner reader = new Scanner(System.in);
        age = reader.nextInt();
        //De nuevo, Alt+Enter para ver las recomendaciones
        System.out.println(questionAverageMark);
        reader = new Scanner(System.in);
        averageMark = reader.nextFloat();
        System.out.println(questionName);
        reader = new Scanner(System.in);
        name = reader.nextLine();
        
        System.out.println("Los datos introducidos son:\n -Nombre: "+name+"\n -Nota media: "+averageMark+"\n -Edad: "+age);
        /**
         * ¿Cómo conseguimos que se listen las funciones del reader como en la 
         * imagen anterior?
         * Repitiendo la función cada vez que se pregunte por un dato, pero
         * teniendo en cuenta cuál es el tipo de cada variable para ponerlo
         * en el código.
         * ¿Por qué se usa una función de reader distinta a la que se usa en el
         * caso anterior?
         * A diferencia de la edad, la nota media no tiene por qué ser un número
         * entero (int), sino que también puede ser uno real (float).
         */
    }
    
}
