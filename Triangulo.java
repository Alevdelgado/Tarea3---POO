public class Triangulo extends Figura implements Comparable<Triangulo>{
    private final double base;
    private final double altura;

    public Triangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }
    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public int obtenerNumeroLados() {
        return 3;
    }

    @Override
    public int compareTo(Triangulo triPorComparar) {
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int misLados = this.obtenerNumeroLados();
        int ladosPorComparar = triPorComparar.obtenerNumeroLados();
    
        if (miArea == areaPorComparar) {
            if (misLados == ladosPorComparar) {
                return 0;
            } else if (misLados > ladosPorComparar) {
                return 1;
            } else {
                return -1;
            }
        } else if (miArea > areaPorComparar) {
            return 1;
        } else {
            return -1;
        }
    }
}
