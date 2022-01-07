import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(33);
        list.add(54);
        list.add(22);
        list.add(6);
        list.add(88);
        list.add(13);
        list.stream().forEach(integer -> {
            if (integer%2==0)
                System.out.println(integer);
        });

    }
}
