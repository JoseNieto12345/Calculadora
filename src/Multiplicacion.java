
public class Multiplicacion {
    private double resultado;

    public double operar(double a, double b) {
        setResultado(a * b);
        return getResultado();
    }

    private double getResultado() { return resultado; }
    private void setResultado(double resultado) { this.resultado = resultado; }
}


