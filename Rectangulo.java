public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private final double base;
    private final double altura;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    
    // implementacion del metodo abstracto
    @Override
    public double calcularArea(){ 
        return base * altura;
    }
    @Override
    public int obtenerNumeroLados() {
        return 4;
    }
    
    // implementacion del metodo compareTo
    @Override
    public int compareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int misLados = this.obtenerNumeroLados();
        int ladosPorComparar = rectPorComparar.obtenerNumeroLados();
    
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
