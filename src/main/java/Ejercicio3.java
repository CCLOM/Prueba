import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n,cont=1;
        System.out.println("Porfavor ingresa el valor de n");
        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(cont+"  ");
                cont++;
            }
            System.out.println("");
        }
    }
}
