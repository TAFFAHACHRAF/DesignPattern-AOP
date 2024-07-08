package BuilderPattern;

public class BankAccount implements Cloneable{
    private int accountId;
    private String currensy;
    private AccountStatus accountStatus;
    private double balance;
    private Customer customer;
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCurrensy() {
        return currensy;
    }

    public void setCurrensy(String currensy) {
        this.currensy = currensy;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BankAccount() { }

    @Override
    public String toString(){
        return "ID : "+accountId+"\n"
                +"CURRENCY : "+currensy+"\n"
                +"BALANCE : "+balance+"\n"
                +"ACCOUNT STATUS : "+accountStatus+"\n";
    }

    public static AccountBuilder builder(){
        return new AccountBuilder();
    }

    public static class AccountBuilder{
        BankAccount bankAccount=new BankAccount();
        public AccountBuilder accountId(int id){
            bankAccount.setAccountId(id);
            return this;
        }
        public AccountBuilder currensy(String currensy){
            bankAccount.setCurrensy(currensy);
            return this;
        }
        public AccountBuilder accountStatus(AccountStatus accountStatus){
            bankAccount.setAccountStatus(accountStatus);
            return this;
        }
        public AccountBuilder balance(double balance){
            bankAccount.setBalance(balance);
            return this;
        }
        public BankAccount build(){
            return bankAccount;
        }
    }
    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount=(BankAccount) super.clone();
        bankAccount.setCustomer(this.customer.clone());
        return bankAccount;
    }
}
