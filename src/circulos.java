

public class circulos extends figurasGeometricas {
    Double radio;
    public circulos(Double radio){}
    public circulos(){}

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;

    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
