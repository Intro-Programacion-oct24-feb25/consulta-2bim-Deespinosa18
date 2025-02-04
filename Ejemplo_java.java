/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package problema01.ejemplo_java;

/**
 *
 * @author Diego
 */
public class Ejemplo_java {

    public class FibonacciRecursivo {
    

        public static int fibonacci(int n) {
            // Caso base
            if (n <= 1) {
                return n;
            }
          
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int numero = 5;
            System.out.println("El " + numero + 
                    "º número de Fibonacci es: " + fibonacci(numero));
        }
    }
}
