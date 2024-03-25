package POO.aula3;

public class testCar {
  public static void main(String[] args) {

    Car van2 = new Car("Fiat", "Ducato", 10, 100, 0.2);
    System.out.println(van2.brand);
    System.out.println(van2.model);
    System.out.println(van2.passengersCount);
    System.out.println(van2.fuelCapacity);
    System.out.println(van2.fuelConsumption);
  }



}
