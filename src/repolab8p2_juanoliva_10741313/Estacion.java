package repolab8p2_juanoliva_10741313;

import java.io.Serializable;

public class Estacion implements Serializable{
    private String nombreEstacion;
    private double x;
    private double y;
    private double distancia;
    
    private static final long SerialVersionUID=1l;

    public Estacion(){
    }

    public Estacion(String nombreEstacion, double x, double y, double distancia) {
        this.nombreEstacion = nombreEstacion;
        this.x = x;
        this.y = y;
        this.distancia = distancia;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombreEstacion;
    }
    
    public void calculardistacia(double x, double y){
        double a = this.x-x;
        double b = this.y-y;
        double powA = a*a;
        double powB = b*b;
        distancia = Math.sqrt(powA+powB);
    }
    
    
    
}
