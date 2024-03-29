package sumadevalores;

public class sumadevalores {

	public static void main(String[] args) {
        // Lista para almacenar los números ingresados por el usuario
        List<Integer> numeros = obtenerNumeros();
        
        // Sumar los valores de la lista
        int suma = sumarValores(numeros);
        
        // Mostrar el resultado
        System.out.println("La suma de los valores ingresados es: " + suma);
    }
    
    // Método para obtener los números ingresados por el usuario
    public static List<Integer> obtenerNumeros() {
        List<Integer> numeros = new ArrayList<>();
        // Aquí puedes cambiar la cantidad de números que deseas que ingrese el usuario
        int cantidadNumeros = 5;
        System.out.println("Por favor, ingrese " + cantidadNumeros + " números:");
        // Aquí puedes implementar la lógica para obtener los números ingresados por el usuario
        // En este ejemplo, simplemente he definido una lista de números fijos para demostrar el funcionamiento.
        // Puedes descomentar las líneas siguientes y comentar las líneas posteriores para permitir al usuario ingresar los números.
        /*
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros.add(new java.util.Scanner(System.in).nextInt());
        }
        */
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        return numeros;
    }
    
    // Método para sumar los valores de una lista de números
    public static int sumarValores(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}