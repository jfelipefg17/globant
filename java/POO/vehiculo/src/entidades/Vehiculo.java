package entidades;
import java.util.Scanner;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private String tipo;
    Scanner nn = new Scanner(System.in);

    public Vehiculo(){

    }
    public Vehiculo(String marca, String modelo, int year, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void crearVehiculo (){

        System.out.println("ingrese marca ");
        this.setMarca(nn.next());
        System.out.println("ingrese modelo ");
        this.setModelo(nn.next());
        System.out.println("ingrese year ");
        this.setYear(nn.nextInt());
        System.out.println("ingrese tipo vehiculo");
        this.setTipo(nn.next());

    }
    public int moverse(int tiempo) {
        if (tipo == "carro"){
            return tiempo * 3;
        }else if (tipo == "moto"){
            return tiempo * 2;
        }else if(tipo == "bici") {
            return tiempo * 1;
        }

        return 0;
    }

    public int frenar(int avanzo) {
        if (tipo == "carro" || tipo == "moto") {
            return avanzo + 2;
        }else if(tipo == "bici") {
            return avanzo;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
