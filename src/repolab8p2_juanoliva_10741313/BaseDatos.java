package repolab8p2_juanoliva_10741313;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BaseDatos{
    private ArrayList<Bus> buses = new ArrayList<Bus>();
    private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();
    private File bus = null;
    private File estacion = null;

    public BaseDatos(String pathBus, String pathEstacion) {
        bus = new File(pathBus);
        estacion = new File(pathEstacion);
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
    
    public void cargarArchivos(){
        try{
            buses=new ArrayList();
            estaciones=new ArrayList();
            Bus tempBus;
            Estacion tempEstacion;
            if (bus.exists()&&estacion.exists()) {
                FileInputStream entradaBus = new FileInputStream(bus);
                FileInputStream entradaEstacion = new FileInputStream(estacion);
                ObjectInputStream oBus = new ObjectInputStream(entradaBus);
                ObjectInputStream oEstacion = new ObjectInputStream(entradaEstacion);
                try{
                    while ((tempBus = (Bus) oBus.readObject())!=null) {
                        buses.add(tempBus);
                    }
                    while ((tempEstacion=(Estacion)oEstacion.readObject())!=null) {
                        estaciones.add(tempEstacion);
                    }
                    
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                oBus.close();
                oEstacion.close();
                entradaBus.close();
                entradaEstacion.close();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivos(){
        FileOutputStream fwBus = null;
        FileOutputStream fwEstacion = null;
        ObjectOutputStream bwBus = null;
        ObjectOutputStream bwEstacion = null;
        
        try{
            fwBus = new FileOutputStream(bus);
            fwEstacion = new FileOutputStream(estacion);
            for (Bus b : buses) {
                bwBus.writeObject(b);
            }
            for (Estacion e : estaciones) {
                bwEstacion.writeObject(e);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
