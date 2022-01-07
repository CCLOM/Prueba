import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int intento;
        int n= (int) (Math.random()*100+1);
        System.out.println(n);
        boolean bandera=false;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adivina el numero:");
            intento=scanner.nextInt();
            if (intento==n) {
                bandera=true;
                break;
            }
            }
        if (bandera)
            System.out.println("Acertado");
        else
            System.out.println("Terminaron los intentos");
        }

}
