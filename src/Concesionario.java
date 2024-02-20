/**
 * Clase Concesionario
 *
 * @author JandroSantos
 * @version 1.0
 */
import java.util.ArrayList;

public class Concesionario {
    /**
     * Atributo autos
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de la clase Concesionario
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Agrega un auto al ArrayList "autos"
     *
     * @param auto Auto a agregar
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Devuelve el ArrayList "autos"
     *
     * @return ArrayList "autos"
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime los autos del ArrayList "autos"
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
