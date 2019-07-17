package trabajo_clase;
public class Ave extends Animal{
    private int numeroHuevos;
    private boolean vuela;
    public Ave(String nombre, double peso, double altura, String colo, int edad1) {
        super(nombre, peso, altura, colo, edad1);
    }

    public Ave(int numeroHuevos, boolean vuela, String nombre, double peso, double altura, String colo, int edad1) {
        super(nombre, peso, altura, colo, edad1);
        this.numeroHuevos = numeroHuevos;
        this.vuela = vuela;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
