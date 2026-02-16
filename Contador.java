import java.util.Scanner;

public class Contador {
   public Contador (Scanner scanner) {
    int vocales = 0;
    int consonantes = 0;
    String palabra = "";
    palabra = palabra.toLowerCase(); 
    System.out.println("Ingresa la palabra a contar:");
   palabra = scanner.nextLine();    
   ; 

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
    
    System.out.println("¿Desea contar otra palabra? (s/n):");
    String respuesta = scanner.next();
    if (respuesta.equalsIgnoreCase("s")) {
        new Contador(scanner);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    new Contador(scanner);
    scanner.close();
}
}