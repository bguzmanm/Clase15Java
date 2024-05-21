import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EjEnteros {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);

    //Utilizando reduce sumar todos los valores de la colección
    int suma = numeros.stream().reduce(0, (a, b) -> a+b);
    System.out.printf("La suma de los valores es: %d\n", suma);

    //Utilizando reduce, sumar todos los valores no repetidos de la colección
    int sumaNoRepetidos = numeros.stream().distinct().reduce(0, (a,b) -> a+b);
    System.out.printf("La suma de los valores no repetidos es: %d\n", sumaNoRepetidos);

    //Convertir todos los datos al tipo float
    List<Float> numerosFloat = numeros.stream().map(Integer::floatValue).collect(Collectors.toList());
    System.out.println(numerosFloat);

    //Filtrar todos los elementos menores de 5 sin repetir
    List<Integer> numerosMenores = numeros.stream().distinct().filter(n -> n < 5).collect(Collectors.toList());
    System.out.println(numerosMenores);

    //Utilizando mapToInt, sumar todos los valores del arreglo.
    int sumaConMapToInt = numeros.stream().mapToInt(Integer::intValue).sum();
    System.out.printf("La suma de los valores es: %d\n", sumaConMapToInt);

    //Utilizando .count(), contar todos los elementos menores que 5.
    long menoresQue5 = numeros.stream().filter(n -> n<5).count();
    System.out.printf("La cantidad de números menores a 5 es : %d\n", menoresQue5);


  }
}
