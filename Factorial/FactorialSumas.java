package factorialsumas;

import java.util.Scanner;

/**
 *
 * @author bitPanG98
 * @fecha : 04-10-2018
 * @github : https://github.com/bitPanG98
 */
public class FactorialSumas {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-> Ingrese el numero : ");
        int numero = entrada.nextInt();

        int suma = 0;
        int factorial = 1;

        for (int i = 2; i <= numero; i++) {

            for (int j = 1; j <= factorial; j++) {
                suma = suma + i;
            }

            factorial = suma;
            suma = 0;
        }

        System.out.println("El factorial de ["+numero+"] es -> " + factorial);

    }

}
