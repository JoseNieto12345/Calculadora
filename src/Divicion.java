public class Divicion {
    private double resultado;
    public double divicion(int num1, int num2){
        setResultado(num1/num2);
        return getResultado();
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
