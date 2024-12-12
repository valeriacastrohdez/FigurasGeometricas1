package Herencia;

public class Triangulo extends FigurasGeometricas {
   float base, altura;

   public void calcularArea() {
      System.out.println("Calculando area del triangulo: " + (base * altura) / 2);

   }

   public void dibujarFigura() {
      System.out.println("dibujando area de triangulo");
   }
}
