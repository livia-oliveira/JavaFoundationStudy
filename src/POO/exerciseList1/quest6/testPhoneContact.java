package POO.exerciseList1.quest6;

public class testPhoneContact {
  public static void main(String[] args) {
    PhoneContact phoneContact = new PhoneContact();

    phoneContact.firstName = "Moranguinho";
    phoneContact.lastName = "Kaori";
    phoneContact.address = "Rua das frutas, número 5";
    phoneContact.email = "morango@gmail.com";
    phoneContact.phones = new String[3];
    phoneContact.phones[0] = "58742658";
    phoneContact.phones[1] = "66565655";
    phoneContact.phones[2] = "59848484";

    System.out.println("Nome: " + phoneContact.firstName + " " + phoneContact.lastName);
    System.out.println("Endereço: " + phoneContact.address);
    System.out.println("E-mail: " + phoneContact.email);
    System.out.println("Números de telefone:");
    for(String phone: phoneContact.phones){
      System.out.println(" - " + phone);
    }
  }
}
