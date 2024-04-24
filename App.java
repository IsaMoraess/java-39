import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Calcule a área de um círculo cujo raio é fornecido pelo usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio do circulo: ");
        double raio = sc.nextDouble();
        double area = 3.14159 * raio * raio;
        System.out.println("A area do circulo e " + area  );
        
    }
}
