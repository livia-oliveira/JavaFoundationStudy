package POO.aula3;

public class Car {
  String brand;
  String model;
  int passengersCount;
  double fuelCapacity;
  double fuelConsumption;

  Car(String brand_, String model_, int passengersCount_, double fuelCapacity_, double fuelConsumption_){
    brand = brand_;
    model = model_;
    passengersCount = passengersCount_;
    fuelCapacity = fuelCapacity_;
    fuelConsumption = fuelConsumption_;

  }

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