/**
 * Clase Auto
 *
 * @author JandroSantos
 * @version 1.0
 */
import java.util.ArrayList;

public class Auto {
    /**
     * Atributo marca
     */
    private String marca;

    /**
     * Atributo modelo
     */
    private String modelo;

    /**
     * Constructor de la clase Auto
     *
     * @param marca Marca del coche
     * @param modelo Modelo del coche
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Getter de atributo marca
     *
     * @return Marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter del atributo marca
     *
     * @param marca Nueva marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter del atributo modelo
     *
     * @return Modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter del atributo modelo
     *
     * @param modelo Nuevo modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve cadena de los atributos de la clase Auto
     *
     * @return Cadena con los atributos de la clase Auto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}