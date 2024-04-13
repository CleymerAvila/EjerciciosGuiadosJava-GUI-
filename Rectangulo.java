import java.util.Scanner;

public class Rectangulo {

	// Ejercicio practico Creacion clase
    
	// Variables globales
    public static double Base;
    public static double Altura;


	// Constructor
    public Rectangulo(){
        Base = 100;
        Altura = 50;

    }

    // Metodos

    // Metodo set Base
    public void setBase(double bas){
        Base = bas;
    }

    // Metodo set Altura
    public void setAltura(double alt){
        Altura = alt;
    }

    // Metodo get Base 
    public double getBase(){
        return Base;
    }

    // Metodo get Altura
    public double getAltura(){
        return Altura;
    }

    // Metodo get Perimetro
    public double getPerimetro(){
        double peri;

        peri = Base * 2 + Altura * 2;

        return peri;
    }

    //Metodo get Area
    public double getArea(){
        double area;

        area = Base * Altura;

        return area;
    }

	// Metodo cuadrar
    public static void cuadrar(){
        Altura = Base;
    }

    
	// Metodo Main // Donde se ejecutara el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Altura: "+ rectangulo.getAltura());
        System.out.println("Base: "+rectangulo.getBase());
        System.out.println("Perimetro: "+ rectangulo.getPerimetro());
        System.out.println("Area: "+rectangulo.getArea());

        System.out.println("\nCambie los valores de la base y la altura: ");
        System.out.print("Base: "); Base = sc.nextDouble();
        rectangulo.setBase(Base);

        System.out.print("Altura: "); Altura = sc.nextDouble();
        rectangulo.setAltura(Altura);

        System.out.println("Perimetro: "+ rectangulo.getPerimetro());
        System.out.println("Area: "+rectangulo.getArea());

        cuadrar();

		System.out.println("\nDatos del rectangulo luego del metodo Cuadrar: ");
        System.out.println("Perimetro: "+ rectangulo.getPerimetro());
        System.out.println("Area: "+rectangulo.getArea());

		sc.close();
    }
}

