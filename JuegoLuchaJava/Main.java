
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre1 = "";
        while (nombre1.isBlank()) {
            System.out.print("Introduce el nombre del jugador 1: ");
            nombre1 = scanner.nextLine();
        }

        String nombre2 = "";
        while (nombre2.isBlank()) {
            System.out.print("Introduce el nombre del jugador 2: ");
            nombre2 = scanner.nextLine();
        }

        Personaje jugador1 = new Mago(nombre1);
        Personaje jugador2 = new Hechicero(nombre2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
    }
}
