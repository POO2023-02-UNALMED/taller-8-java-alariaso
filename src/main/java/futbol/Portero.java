package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object o) {
        Portero otro = (Portero) o;
        return Math.abs(golesRecibidos - otro.golesRecibidos);
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public String toString() {
        return String.format("%s con el dorsal %d. Le han marcado %d", super.toString(), dorsal, golesRecibidos);
    }
}
