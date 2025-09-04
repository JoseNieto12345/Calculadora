
public class Multiplicacion {
    private double resultado;

    public double operar(int numero1, int numero2) {
        setResultado(numero1 * numero2);
        return getResultado();
    }

    private void setResultado(double resultado) { this.resultado = resultado; }
    private double getResultado() { return resultado; }
}


