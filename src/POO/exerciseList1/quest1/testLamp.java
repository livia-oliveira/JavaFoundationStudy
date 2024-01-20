package POO.exerciseList1.quest1;

public class testLamp {
  public static void main(String[] args) {
    Lamp lamp = new Lamp();
    lamp.brand = "G-light";
    lamp.model = "Bulbo A60";
    lamp.power = 9;
    lamp.colorTemperature = 6500;
    lamp.lightingTechnology = "LED";

    System.out.println(lamp.brand);
    System.out.println(lamp.model);
    System.out.println(lamp.power);
    System.out.println(lamp.colorTemperature);
    System.out.println(lamp.lightingTechnology);
  }
}
