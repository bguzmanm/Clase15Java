import java.util.Arrays;
import java.util.List;

public class Reduccion {
  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(2, 3, 10, 5, 6, 7);

    int sumatoria = lista.stream().reduce(0, (a, b) -> a + b);

    // valor -> valor * valor;
    // function (a, b) { return a + b }

    System.out.println(sumatoria);

    System.out.println(lista.stream().reduce(0, Integer::max));
    System.out.println(lista.stream().reduce(1000, Integer::min));

    System.out.println(lista.stream().filter(n -> n>=5).count());




  }
}
