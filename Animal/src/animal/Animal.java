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
public class Animal {
    private int numeroPatas;
    private int numeroDeOjos;
    private String color;

    public Animal() {
    }

    public Animal(int numeroPatas, int numeroDeOjos, String color) {
        this.numeroPatas = numeroPatas;
        this.numeroDeOjos = numeroDeOjos;
        this.color = color;
    }

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal ani = new Animal(4, 2, "negro");
        System.out.println(ani);
        
        Perro perr = new Perro("Pastor Belga Malinois", 35, "Odín", 4, 4, 2, "café");
        System.out.println(perr);
        
        Gato gat = new Gato("siamés", "mediano", 2, "azules", 4, 2, "Blanco");
        System.out.println(gat);
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroDeOjos() {
        return numeroDeOjos;
    }

    public void setNumeroDeOjos(int numeroDeOjos) {
        this.numeroDeOjos = numeroDeOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", numeroDeOjos=" + numeroDeOjos + ", color=" + color + '}';
    }
    
}
