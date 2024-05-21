import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colectores {
  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(2, 3, 4, 5, 6, 7);
    List<Integer> numerosAumentados = lista.stream().map(n -> n*n).collect(Collectors.toList());

    System.out.println(lista);
    System.out.println(numerosAumentados);

  }
}
