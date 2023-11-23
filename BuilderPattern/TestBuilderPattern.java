package BuilderPattern;

public class TestBuilderPattern {
    public static void main(String args[]) throws CloneNotSupportedException {
        BankAccount bankAccount1= BankAccount.builder().currensy("MD").build();
        bankAccount1.setCustomer(new Customer());
        BankAccount bankAccount2=bankAccount1.clone();
        System.out.println(bankAccount1.getCustomer());
        System.out.println(bankAccount2.getCustomer());
    }
}
