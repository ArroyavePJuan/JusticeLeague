package org.example;

import newclasses.Villano;
import org.examplepack.Pareja;

public class CuartelGeneral {



    public static void main(String[] args) {

       //creo un heroe
       Hero heroe = new Hero();
       heroe.setNombre("Batman");
       heroe.setPoder(800);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPoder());

       //creo un villano
        Villano villano = new Villano();


        //creo una pareja
        Pareja pareja = new Pareja("Luisa lane");


    }
}