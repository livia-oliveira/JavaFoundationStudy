package POO.aula2;

import POO.aula2.Car;

public class testCar {
  public static void main(String[] args) {
    Car van = new Car();
    van.brand = "Fiat";
    van.model = "Ducato";
    van.passengersCount = 10;
    van.fuelCapacity = 100;
    van.fuelConsumption = 0.2;

    System.out.println("Marca: "+van.brand);
    System.out.println("Modelo: "+van.model);
    System.out.println("Número de passageiros: "+van.passengersCount);
    System.out.println("Capacidade de combustível: "+van.fuelCapacity);
    System.out.println("Consumo de combustível: "+van.fuelConsumption);

    van.showAutonomy();
  }
}
