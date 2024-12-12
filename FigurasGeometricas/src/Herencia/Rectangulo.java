package Herencia;

public class Rectangulo extends FigurasGeometricas {
  float lado;

  public void calcularArea() {
    this.area = (float) Math.pow(lado * lado, 2);
    System.out.println("Calculando area del triangulo: " + this.area);

  }

  public void dibujarFigura() {
    System.out.println("dibujando area de rectangulo" + this.area);
  }
}
