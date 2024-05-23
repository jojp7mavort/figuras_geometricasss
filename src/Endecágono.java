public class Endecágono extends figurasGeometricas{
    int lados;
    Double longitud_lado;

    public Endecágono(int lados, Double longitud_lado) {
        this.lados = lados;
        this.longitud_lado = longitud_lado;
    }

    public Endecágono() {
    }

    public Double getLongitud_lado() {
        return longitud_lado;
    }


    public int getLados() {
        return lados;
    }


    public void setLados(int lados) {
        this.lados = lados;
    }

    public void setLongitud_lado(Double longitud_lado) {
        this.longitud_lado = longitud_lado;
    }

    public double calcularArea() {
        double area = lados * longitud_lado;
    }
}
