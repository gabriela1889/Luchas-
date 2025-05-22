
import java.util.Random;

public class Hechicero extends Personaje {
    private final int MIN_CURACION = 5;
    private final int MAX_CURACION = 15;

    public Hechicero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        super.atacar(oponente);
        Random rand = new Random();
        int curacion = rand.nextInt((MAX_CURACION - MIN_CURACION) + 1) + MIN_CURACION;
        this.puntosDeVida += curacion;
        if (this.puntosDeVida > 100) {
            this.puntosDeVida = 100;
        }
        System.out.println(this.nombre + " se cura con energía oscura y recupera " + curacion + " puntos de vida.");
    }
}
