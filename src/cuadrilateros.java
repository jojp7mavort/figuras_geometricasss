
public class cuadrilateros extends figurasGeometricas {
    Double base;
    Double altura;

    public cuadrilateros(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public cuadrilateros() {

    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base*altura;
    }
}
