public class Nota {
    private double numero;
    private int instancia;
    private String fecha;

    public Nota(double numero, int instancia, String fecha) {
        this.numero = numero;
        this.instancia = instancia;
        this.fecha = fecha;
    }

    public Nota() {
    }

    @Override
    public String toString() {
        return "Nota{" +
                "numero=" + numero +
                ", instancia=" + instancia +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getInstancia() {
        return instancia;
    }

    public void setInstancia(int instancia) {
        this.instancia = instancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
