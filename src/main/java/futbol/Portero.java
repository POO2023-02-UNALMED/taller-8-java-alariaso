package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad) {
        super(nombre, edad, "Portero");
    }

    @Override
    public int compareTo(Futbolista o) {
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
