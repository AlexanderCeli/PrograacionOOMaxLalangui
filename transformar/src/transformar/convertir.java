package transformar;
public class convertir {
   public double numero1;
   public double resultado;
   public double resultado1;

    public convertir() {
       
    }
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getResultado1() {
        return resultado1;
    }
    public void setResultado1(double resultado1) {
        this.resultado1 = resultado1;
    }
    public convertir(double numero1, double resultado,double resultado1) {
        this.numero1 = numero1;
        this.resultado = resultado;
        this.resultado1= resultado1;
    }
     public void calcular(){
       resultado=numero1*60;    
    }
    public void calcular2(){
       resultado1=numero1/3600;
    }
    public void calcular3(){
       resultado=numero1/60;
    }
    public void calcular4(){
       resultado1 = numero1*3600;
    }
    public void calcular5(){
       resultado1 = (numero1*60)/3600;
    }
 }
