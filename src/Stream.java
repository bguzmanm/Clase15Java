import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(2, 3, 4, 5, 6, 7);
/*
    System.out.println(lista);

    for (int i = 0; i < lista.size(); i++) {
      System.out.println("[" + lista.get(i) + "]");
    }
*/
    lista.stream()
            .forEach(System.out::println);

    System.out.println("MAP!");

    List<Integer> listaPorTres = new ArrayList<Integer>();
    // lista.stream().map(value -> value*3).forEach(System.out::println);
    lista.stream()
            .map(value -> value*3)
            .forEach(listaPorTres::add);

    lista.stream()
            .map(Stream::porCuatro)
            .forEach(listaPorTres::add);

    System.out.println(lista);
    System.out.println(listaPorTres);
  }

  static int porCuatro(int value) {
    return value * 4;
  }
}