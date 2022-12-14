package Geometria3D;
public class octaedroRegular {
    private double lado;
    private double volumen;
    private double areaSuperficial;
    //Constructor
    public octaedroRegular(double lado) {
        this.lado = lado;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = 2 * Math.sqrt(3) * Math.pow(this.lado, 2);
    }
    public void calcularVolumen(){
        volumen = (Math.sqrt(2) * Math.pow(this.lado,3))/3;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
