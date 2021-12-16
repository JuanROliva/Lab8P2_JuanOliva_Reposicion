package repolab8p2_juanoliva_10741313;

import java.awt.Color;
import java.util.ArrayList;

public class Bus {

    private String placa;
    private String marca;
    private Color color;
    private ArrayList<Estacion> listaEstaciones = new ArrayList<Estacion>();
    private double velocidad;

    public Bus() {
    }

    public Bus(String placa, String marca, Color color, double velocidad) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Estacion> getListaEstaciones() {
        return listaEstaciones;
    }

    public void setListaEstaciones(ArrayList<Estacion> listaEstaciones) {
        this.listaEstaciones = listaEstaciones;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Bus "+ placa;
    }
}
