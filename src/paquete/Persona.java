package paquete;

import java.util.Random;

public class Persona {
    String nombre = "";
    String DNI;
    String sexo = "hombre";
    int edad = 0;
    int peso = 0;
    double altura = 0;

    public Persona(){
        this.DNI = generaDNI();
    }
    public Persona(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = generaDNI();
    }
    public Persona(String nombre, String sexo, int edad, int peso, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public int calcularIMC(){
        final double imc = this.peso / Math.pow(this.altura,2);
        if(imc < 20 ){
            return -1;
        }else if( imc>19 && imc <= 25 ){
            return 0;
        }else{
            return 1;
        }
    }

    public void esMayorDeEdad(){
        if( this.edad < 18 ){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }
    }

    public void comprobarSexo(String sexo){
        if( this.sexo == sexo ){
            System.out.println("Si es " + sexo);
        }else{
            System.out.println("No no es " + sexo);;
        }
    }

    public void informacionPersona(){
        System.out.println("La persona tiene " + this.edad + " su nombre es " + this.nombre + " es de genero " + this.sexo + " su altura es de \n" +
                this.altura + " su peso de " + this.peso + " y su DNI es " + this.DNI
        );
    }

    private String generaDNI(){
        int numero = (int)(Math.random()* 100000000);
        Random random = new Random();
        char caracterRandom = (char) (random.nextInt(26) + 'a');
        return "" + numero + Character.toUpperCase(caracterRandom);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setEdad(int edad){ this.edad = edad; }
}
