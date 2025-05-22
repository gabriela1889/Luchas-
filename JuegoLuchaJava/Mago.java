
import java.util.Random;

public class Mago extends Personaje {
    private final int MAX_DANO_MAGO = 40;
    private final int MIN_DANO_MAGO = 20;

    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO_MAGO - MIN_DANO_MAGO) + 1) + MIN_DANO_MAGO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " lanza una bola de fuego mística y causa " + dano + " puntos de daño.");
    }
}
