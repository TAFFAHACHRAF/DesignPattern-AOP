package Builder;

public class TestBuilderPattern {
    public static void main(String args[]){
        BankAccount bankAccount= BankAccount.builder().accountId(8541)
                .accountStatus(AccountStatus.SAVING_ACCOUNT)
                .balance(84512)
                .currensy("DH")
                .build();
        System.out.println(bankAccount.toString());
    }
}
