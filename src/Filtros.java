import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtros {
  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(2, 3, 4, 5, 6, 7);

    List<Integer> MayorA4 = lista.stream()
                                .filter(n -> n >= 4)
                                .map(value -> value * value)
                                .collect(Collectors.toList());

    System.out.println(MayorA4);

    List<Integer> numDuplicados = Arrays.asList(2, 3, 2, 5, 3, 2);
    System.out.println("DISTINCT:");
    numDuplicados.stream().distinct().forEach(System.out::println);

    System.out.println("LIMIT:");
    numDuplicados.stream().limit(2).forEach(System.out::println);

    System.out.println("SKIP:");
    numDuplicados.stream().skip(3).forEach(System.out::println);


  }
}
