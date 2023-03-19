public class Circulo extends Figura implements Comparable<Circulo>{
    private final double radio;
    public Circulo(double pRadio){
       radio = pRadio;
    }
    @Override
    public double calcularArea(){
        return Math.PI* radio*radio;
    }

    @Override
    public int obtenerNumeroLados() {
        return 0;
    }

    @Override
    public int compareTo(Circulo cirPorComparar) {
        double areaPorComparar = cirPorComparar.calcularArea();
        double miArea = this.calcularArea();
    
        if (miArea == areaPorComparar) {
            return 0;
        } else if (miArea > areaPorComparar) {
            return 1;
        } else {
            return -1;
        }
    }
}
