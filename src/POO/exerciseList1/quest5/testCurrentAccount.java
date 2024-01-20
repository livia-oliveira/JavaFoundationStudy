package POO.exerciseList1.quest5;

public class testCurrentAccount {
  public static void main(String[] args) {
    CurrentAccount currentAccount = new CurrentAccount();
    currentAccount.numberAccount = "2554-9";
    currentAccount.branchAccount = "6585";
    currentAccount.balance = 1500.00;
    currentAccount.special = true;
    currentAccount.specialLimit = 500.0;

    System.out.println("Número da Conta: " + currentAccount.numberAccount);
    System.out.println("Agência: " + currentAccount.branchAccount);
    System.out.println("Saldo: $" + currentAccount.balance);
    System.out.println("É uma conta especial: "+ (currentAccount.special ? "Sim" : "Não"));
    if(currentAccount.special){
      System.out.println("O limite do cheque especial é R$: "+ currentAccount.specialLimit);
    }

  }
}
