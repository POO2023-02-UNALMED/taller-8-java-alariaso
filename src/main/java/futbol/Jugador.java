package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        golesMarcados = 289;
        dorsal = 7;
    }

    @Override
    public int compareTo(Futbolista o) {
        return Math.abs(getEdad() - o.getEdad());
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
    
    public String toString() {
        String s = super.toString();
        return String.format("%s con el dorsal %d. Ha marcado %d", s, dorsal, golesMarcados);
    }
}
