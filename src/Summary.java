import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Summary {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(3, 5, 7, 9, 11, 13, 15);

    IntSummaryStatistics estadisticas = numeros.stream()
            .mapToInt(Integer::intValue)
            .summaryStatistics();

    System.out.printf("Cantidad: %d\n", estadisticas.getCount());
    System.out.printf("Suma: %d\n", estadisticas.getSum());
    System.out.printf("Promedio: %.2f\n", estadisticas.getAverage());
    System.out.printf("Minimo: %d\n", estadisticas.getMin());
    System.out.printf("Máximo: %d\n", estadisticas.getMax());

  }
}
