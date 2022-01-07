import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("juan");
        lista.add("pedro");
        lista.add("jose");
        lista.add("maria");
        lista.add("sofia");
        for (int i = 0; i < lista.size(); i++) {
            String aux=lista.get(i).toString();
            lista.set(i,Character.toUpperCase(aux.charAt(0))+aux.substring(1,aux.length()));
        }
        for (String elemeno:lista ) {
            System.out.println(elemeno);
        }
    }

}
