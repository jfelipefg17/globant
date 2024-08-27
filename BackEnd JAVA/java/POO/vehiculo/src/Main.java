import entidades.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo("chevrlote", "beat",2020,"carro");

        Vehiculo moto = new Vehiculo("suzuki", "gixxer",2020,"moto");

        Vehiculo bici = new Vehiculo("gw", "nada",2020,"bici");

        System.out.println("------------");
        System.out.println(carro.moverse(5) + " metros ");
        System.out.println(carro.frenar(carro.moverse(5))+ " metros");
        System.out.println("------------");
        System.out.println(moto.moverse(5) +  " metros");
        System.out.println(moto.frenar(moto.moverse(5))+ " metros");
        System.out.println("------------");
        System.out.println(bici.moverse(5) + " metros");
        System.out.println(bici.frenar(bici.moverse(5))+ " metros");
        System.out.println("------------");

    }
}