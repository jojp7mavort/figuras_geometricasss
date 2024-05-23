

public class Main {
    public static void main(String[] args) {

        figurasGeometricas miFigura= new figurasGeometricas();
        circulos miFigura2= new circulos();
        triangulos miFigura3= new triangulos();
        cuadrilateros miFigura4= new cuadrilateros();
        Endecágono miFigura8 = new Endecágono();

        circulos miFigura5 = new circulos(5.00);
        triangulos miFigura6 = new triangulos(6.00,5.00);
        cuadrilateros miFigura7 = new cuadrilateros(5.00,2.00);
        Endecágono mifigura9 = new Endecágono(3,3);


        System.out.println(mifigura9.getArea());
        //miFigura2.setRadio(4.00);
        //System.out.println(miFigura2.getNombre());

        //System.out.println("La nueva area es: ");
        //miFigura2.setRadio(4.00);
        //System.out.println(miFigura2.getRadio());

    }


}

