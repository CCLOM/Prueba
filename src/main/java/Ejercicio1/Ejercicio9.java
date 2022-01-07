package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {
        Integer[] a={1,2,4,6,8,0,3,44,52,43,129};
        List<Integer> listaA= new ArrayList<Integer>();
        listaA= Arrays.asList(a);
        ArrayList<Integer> listaB= new ArrayList();
        ArrayList<Integer> listaC= new ArrayList();
        System.out.println(listaA);
        for (Integer i:listaB) {
            if (listaA.contains(i))
                listaC.add(i);
        }
        System.out.println("lista C: "+listaC);
    }
}
