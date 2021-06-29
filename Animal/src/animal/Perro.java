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
public class Perro extends Animal{
    private String raza;
    private int peso;
    private String nombre;
    private int edad;

    public Perro() {
    }

    public Perro(String raza, int peso, String nombre, int edad) {
        this.raza = raza;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Perro(String raza, int peso, String nombre, int edad, int numeroPatas, int numeroDeOjos, String color) {
        super(numeroPatas, numeroDeOjos, color);
        this.raza = raza;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", peso=" + peso + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
