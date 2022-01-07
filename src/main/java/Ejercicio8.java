import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;
        System.out.println("ingresa a");
        a= scanner.nextInt();
        System.out.println("ingresa b");
        b= scanner.nextInt();
        System.out.println("ingresa c");
        c= scanner.nextInt();


        if (a>b){
            if (c>a)
                System.out.println(c+" "+a+" "+b);
            else
            if (b>c)
                System.out.println(a+" "+b+" "+c);
            else
                System.out.println(a+" "+c+" "+b);
        }
        else{
            if (c>b)
                System.out.println(c+" "+b+" "+a);
            else
            if (a>c)
                System.out.println(b+" "+a+" "+c);
            else
                System.out.println(b+" "+c+" "+a);
        }



    }
}
