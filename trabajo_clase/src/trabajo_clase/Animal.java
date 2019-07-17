package trabajo_clase;
public class Animal{
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    public int getEdad1() {
        return edad1;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }
    private double peso;
    private double altura;
    private String colo;
    private int edad1;

    public Animal(String nombre, double peso, double altura, String colo, int edad1) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.colo = colo;
        this.edad1 = edad1;
    }
    
    public void alimentarse(){
        System.out.println("soy"+nombre+"y me alimento");
    }
    public String informacionAnimal(){
        String cadena= "Soy un " + nombre + "Mi peso es :" + "Mi color es:"+colo;
        return cadena;
    }
    
    
}
