package Herencia;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FigurasGeometricas figura = new FigurasGeometricas();
        int opcion;
        Scanner tec = new Scanner(System.in);
        Triangulo objtriangulo = new Triangulo();
        Circulo objcirculo = new Circulo();
        Rectangulo objrectangulo = new Rectangulo();
        System.out.println("Menu de Opciones");
        System.out.println("1. Cálculo del area y dibujo de un triangulo");
        System.out.println("2. Cálculo del area y dibujo de un circulo");
        System.out.println("2. Cálculo del area y dibujo de un rectangulo");
        System.out.println("4. Salir");
        opcion = tec.nextInt();
        switch (opcion) {
            case 1:
                objtriangulo.nombre = "Triángulo";
                System.out.println("Dame la base del triángulo:");
                objtriangulo.base = tec.nextFloat();
                System.out.println("Dame la altura del triángulo:");
                objtriangulo.altura = tec.nextFloat();
                objtriangulo.calcularArea();
                objtriangulo.dibujarFigura();
            case 2:
                objcirculo.nombre = "Círculo";
                System.out.println("Dame el radio del círculo:");
                objcirculo.radio = tec.nextFloat();
                objcirculo.calcularArea();
                objcirculo.dibujarFigura();
            case 3:
                objrectangulo.nombre = "Rectángulo";
                System.out.println("Dame la base del Rectángulo:");
                objrectangulo.lado = tec.nextFloat();
                System.out.println("Dame la altura del Rectángulo:");
                objrectangulo.lado = tec.nextFloat();
                objrectangulo.calcularArea();
                objrectangulo.dibujarFigura();
            case 4:
                System.exit(0);
        }

    }
}
