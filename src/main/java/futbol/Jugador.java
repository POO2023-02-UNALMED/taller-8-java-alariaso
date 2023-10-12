package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        golesMarcados = 289;
        dorsal = 7;
    }

    @Override
    public int compareTo(Object o) {
        Jugador j = (Jugador) o;
        return Math.abs(getEdad() - j.getEdad());
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
