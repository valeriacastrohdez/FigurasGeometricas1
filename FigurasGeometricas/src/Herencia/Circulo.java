package Herencia;

public class Circulo extends FigurasGeometricas {
    float radio;

    public void calcularArea() {
        this.area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("Calculando area del circulo: " + this.area);
    }

    public void dibujarFigura() {
        System.out.println("dibujando area del circulo");
    }
}