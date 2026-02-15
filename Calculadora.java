import java.util.Scanner;

public class Calculadora {
    public Calculadora(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Seleccione la operación (+, -, *, /):");
        String operacion = scanner.next();

        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
        
        System.out.println("¿Desea realizar otra operación? (s/n):");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) { 
            new Calculadora(scanner);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Calculadora(scanner);
        scanner.close();
    }
}