package Ejercicio1;

public class Rectangulo implements Forma{
    double area;

    public double calculaArea(double base,double altura) {
        return base*altura;
    }

    @Override
    public double calculaArea() {
        return 25;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo= new Rectangulo();
        System.out.println(rectangulo.calculaArea());
        System.out.println(rectangulo.calculaArea(10,5));
    }
}
