import java.util.Scanner;

public class Contador {
   public Contador (Scanner scanner) {
    int vocales = 0;
    int consonantes = 0;
    String palabra ; 
    System.out.println("Ingresa la palabra a contar:");
   palabra = scanner.nextLine().toLowerCase();    
   

    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            vocales++;
        } else if (Character.isLetter(letra)) {
            consonantes++;
        }
    }
    System.out.println("Vocales: " + vocales);
    System.out.println("Consonantes: " + consonantes);
    System.out.println("deseas contar otra palabra? (s/n)");
    String respuesta = scanner.nextLine().toLowerCase();        
    if (respuesta.equals("s")) {
        new Contador(scanner);
    } else {
        System.out.println("Gracias por usar el contador de vocales y consonantes.");
    }

}
 


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    new Contador(scanner);
    
    scanner.close();
}
}