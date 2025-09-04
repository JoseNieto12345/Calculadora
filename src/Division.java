public class Division {
    private double resultado;


    public double Division(int numero1, int numero2){
        setResultado(numero1/numero2);

        return getResultado();
    }
    public void setResultado(double resultado) {

        this.resultado = resultado;
    }

    public double getResultado() {

        return resultado;
    }
}
