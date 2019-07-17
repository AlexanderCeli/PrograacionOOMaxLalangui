package trabajo_clase;
public class Mamifero extends Animal {
    private double tiempogestacion ;
    private boolean sanfrecaliente;
    public Mamifero(String nombre, double peso, double altura, String colo, int edad1) {
        super(nombre, peso, altura, colo, edad1);
        
    }

    public Mamifero(double tiempogestacion, boolean sanfrecaliente, String nombre, double peso, double altura, String colo, int edad1) {
        super(nombre, peso, altura, colo, edad1);
        this.tiempogestacion = tiempogestacion;
        this.sanfrecaliente = sanfrecaliente;
    }

    public double getTiempogestacion() {
        return tiempogestacion;
    }

    public void setTiempogestacion(double tiempogestacion) {
        this.tiempogestacion = tiempogestacion;
    }

    public boolean isSanfrecaliente() {
        return sanfrecaliente;
    }

    public void setSanfrecaliente(boolean sanfrecaliente) {
        this.sanfrecaliente = sanfrecaliente;
    }
    
}
