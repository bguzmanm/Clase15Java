import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjNombres {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Anastasia", "Beatriz", "Clara", "Carla", "Marianela", "Paula", "Pia");

    // Obtener todos los elementos que excedan los 5 caracteres
    List<String> nombresLargos = nombres.stream().filter(n -> n.length() > 5).collect(Collectors.toList());
    System.out.println(nombresLargos);

    //Utilizar map para transformar todos los nombres a minúsculas
    List<String> nombresToLowerCase = nombres.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
    System.out.println(nombresToLowerCase);

    //Crear un arreglo con todos los nombres que comiencen con P
    List<String> comienzanConP = nombres.stream().filter(n -> n.toLowerCase().startsWith("p")).collect(Collectors.toList());
    System.out.println(comienzanConP);

    //Utilizando .count, contar los elementos que empiecen con 'A', 'B' o 'C'.
    long empienzan = nombres.stream()
            .filter(n-> n.toLowerCase().startsWith("a") ||
                    n.toLowerCase().startsWith("b") ||
                    n.toLowerCase().startsWith("c")).count();

    System.out.printf("Elementos que empiezan con A, B y C: %d\n", empienzan);

    //Utilizando .map, crea un arreglo con la cantidad de letras que tiene cada nombre
    List<Integer> cantidadLetras = nombres.stream().map(String::length).collect(Collectors.toList());
    System.out.println(cantidadLetras);


  }
}
