import java.util.Scanner;

public class Invertirtexto {
    public Invertirtexto(Scanner scanner) {
        System.out.println("Ingrese el texto a invertir:");
        String texto = scanner.nextLine();
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + textoInvertido);
        
        System.out.println("¿Desea invertir otro texto? (s/n):");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            new Invertirtexto(scanner);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Invertirtexto(scanner);
        scanner.close();
    }
}