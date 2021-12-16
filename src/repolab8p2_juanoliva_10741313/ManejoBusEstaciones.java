package repolab8p2_juanoliva_10741313;

import java.util.ArrayList;

public class ManejoBusEstaciones extends Thread{
    
    private Bus b;
    private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();

    public ManejoBusEstaciones(Bus b) {
        this.b = b;
    }

    public Bus getB() {
        return b;
    }

    public void setB(Bus b) {
        this.b = b;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
    
    @Override
    public void run(){
        
    }
    
    
}
