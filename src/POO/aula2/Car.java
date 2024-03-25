package POO.aula2;

public class Car {
  String brand;
  String model;
  int passengersCount;
  double fuelCapacity;
  double fuelConsumption;

  void showAutonomy(){
    System.out.println("A autonomia do carro é: "+ fuelCapacity * fuelConsumption+" km");
  }

  double achieveAutonomy(){
    System.out.println("Método obterAutonomia foi chamado");
    return fuelCapacity * fuelConsumption;
  }

  double calculateFuel(double km){
    double fuelQuantity = km/fuelConsumption;
    return fuelQuantity;
  }
}
