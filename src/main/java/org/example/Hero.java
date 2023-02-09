package org.example;

public class Hero {

    private String nombre;
    private int poder; // 0 - 100

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder >= 0 && poder <= 100){
             this.poder=poder;
        } else{
            System.out.println("Poder incorrecto");
        }

    }

    public Hero() {

    }

    public Hero(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String saludar(String nombre){

        return ("Te vencere" + nombre);
    }

}
