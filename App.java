import java.util.Arrays;
public class App {
    public static void main(String[] args) {
    // Rectangulo 
        Figura[] rectangulos = new Figura[4];
        rectangulos[0] = new Rectangulo(2.5,3.0);
        rectangulos[1] = new Rectangulo(1.7,2.2);
        rectangulos[2] = new Rectangulo(2.8,3.1);
        rectangulos[3] = new Rectangulo(3.5,1.2);
        Arrays.sort(rectangulos);

    // Triangulo
        Figura[] triangulos = new Figura[4];
        triangulos[0] = new Triangulo(2.5,3.0);
        triangulos[1] = new Triangulo(1.7,2.2);
        triangulos[2] = new Triangulo(2.8,3.1);
        triangulos[3] = new Triangulo(3.5,1.2);
        Arrays.sort(triangulos);

    // Circulo
        Figura[] circulos = new Circulo[4];
        circulos[0] = new Circulo(2.5);
        circulos[1] = new Circulo(1.7);
        circulos[2] = new Circulo(2.8);
        circulos[3] = new Circulo(3.5);
        Arrays.sort(circulos);

    
    // Para el rectangulo:
        System.out.println("RECTANGULO");
        for (Figura figura : rectangulos) {
            
            System.out.println("Area del rectangulo: " + figura.calcularArea());
            System.out.println("Lados del rectangulo: " + figura.obtenerNumeroLados());
            System.out.println();
        }
     // Para el Triangulo:
        System.out.println("TRIANGULO");
        for (Figura figura : triangulos) {
            
            System.out.println("Area del Triangulo: " + figura.calcularArea());
            System.out.println("Lados del triangulo: " + figura.obtenerNumeroLados());
            System.out.println();
        }
        
     // Para el Circulo:
        System.out.println("Circulo");
        for (Figura figura : circulos) {
            
            System.out.println("Area del Circulo: " + figura.calcularArea());
            System.out.println();
        }
    }
    
}
