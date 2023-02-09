package newclasses;

import org.example.Hero;

public class Villano {

    protected String nombre;
    public int poder;
    private Hero heroe;

    public int destruir(){

        int resultado = this.poder-this.heroe.getPoder();
        return(resultado);

    }

}
