

public class triangulos extends figurasGeometricas {
    Double area;
    Double altura;
    Double base;

    public triangulos(Double base, Double altura, Double area){}

    public triangulos() {

    }

    public triangulos(double v, double v1) {
    }

    public Double getarea() {
        return area;
    }

    public void setRadio(Double base) {
        this.area = area;

    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }
}
