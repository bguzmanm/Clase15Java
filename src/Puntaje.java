import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Tienes una lista de puntuaciones de diferentes jugadores en un juego,
 * donde cada puntuación es un número entero.
 * Tu tarea es implementar varias operaciones utilizando la API de Streams en Java
 * para analizar estas puntuaciones.
 *
 * 1. Calcular la puntuación total de todos los jugadores:
 *     - Suma todas las puntuaciones en la lista.
 * 2. Encontrar la puntuación más alta:
 *     - Encuentra y devuelve la puntuación más alta en la lista.
 * 3. Obtener las puntuaciones que son múltiplos de 5:
 *     - Filtra y devuelve una lista con solo las puntuaciones que son múltiplos de 5.
 */
public class Puntaje {


  public static void main(String[] args) {
    List<Integer> puntuaciones = Arrays.asList(15, 23, 10, 5, 30, 45, 22, 18, 60, 3, 25, 60);

    System.out.printf("La sumatoria de las puntuaciones es: %d\n", totalPuntuaciones(puntuaciones));
    System.out.printf("La puntuación más alta es: %d\n", puntuacionMasAlta(puntuaciones));
    System.out.println(multiplosDe5(puntuaciones));

  }

  static int totalPuntuaciones(List<Integer> puntuaciones){
    return puntuaciones.stream().mapToInt(Integer::intValue).sum();
  }

  static int puntuacionMasAlta(List<Integer> puntuaciones) {
    return puntuaciones.stream()
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);// .orElseThrow(NoSuchElementException ::new);
  }

  static List<Integer> multiplosDe5(List<Integer> puntuaciones) {
    return puntuaciones.stream().filter(n -> n%5==0).collect(Collectors.toList());
  }
}
