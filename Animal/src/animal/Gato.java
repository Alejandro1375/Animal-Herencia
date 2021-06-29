/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Supervisor
 */
public class Gato extends Animal{
    private String raza;
    private String tamanio;
    private int numColores;
    private String colorOjos;

    public Gato() {
    }

    public Gato(String raza, String tamanio, int numColores, String colorOjos) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.numColores = numColores;
        this.colorOjos = colorOjos;
    }

    public Gato(String raza, String tamanio, int numColores, String colorOjos, int numeroPatas, int numeroDeOjos, String color) {
        super(numeroPatas, numeroDeOjos, color);
        this.raza = raza;
        this.tamanio = tamanio;
        this.numColores = numColores;
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getNumColores() {
        return numColores;
    }

    public void setNumColores(int numColores) {
        this.numColores = numColores;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + ", tamanio=" + tamanio + ", numColores=" + numColores + ", colorOjos=" + colorOjos + '}';
    }
    
}
