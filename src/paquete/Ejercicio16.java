package paquete;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique nombre");
        String nombre = scan.nextLine();
        System.out.println("Indique edad");
        int edad = Integer.parseInt(scan.nextLine());
        System.out.println("Indique sexo, hombre o mujer (con esas alabras)");
        String sexo = scan.nextLine();
        System.out.println("Indique altura en metros");
        double altura = Double.parseDouble(scan.nextLine());
        System.out.println("Indique peso en Kg enteros");
        int peso = Integer.parseInt(scan.nextLine());

        Persona persona1 = new Persona(nombre, sexo, edad, peso, altura);

        System.out.println("Indique nombre de la segunda persona");
        String nombre2 = scan.nextLine();
        System.out.println("Indique edad de la segunda persona");
        int edad2 = Integer.parseInt(scan.nextLine());
        System.out.println("Indique sexo, hombre o mujer (con esas alabras) de la segunda persona");
        String sexo2 = scan.nextLine();

        Persona persona2 = new Persona(nombre2, sexo2, edad2);
        Persona persona3 = new Persona();
        persona3.setAltura(1.90);
        persona3.setNombre("Mauricio");
        persona3.setPeso(84);
        persona3.setSexo("hombre");

        persona1.comprobarSexo("hombre");
        persona1.calcularIMC();
        persona2.comprobarSexo("hombre");
        persona2.calcularIMC();
        persona3.comprobarSexo("hombre");
        persona3.calcularIMC();

        persona1.informacionPersona();
        persona2.informacionPersona();
        persona3.informacionPersona();


    }
}
