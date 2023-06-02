package oop.BankAccount.basics.bankAccount;

public class bankAccount {
    private Integer number;
    private String name;
    private Integer balance;

    // public bankAccount(Integer number, String name, Integer balance){
    //     this.number = number;
    //     this.name = name;
    //     this.balance = balance;
    // }

    public static void main(String[] args){
        bankAccount Alice = new bankAccount();
        Alice.setBalance(1000);
        Alice.setName("Alice");
        Alice.setNumber(2);
    
        bankAccount Bob = new bankAccount();
        Bob.setBalance(5000);
        Bob.setName("Bob");
        Bob.setNumber(1);
    
        Alice.transfer(100, Bob);
        System.out.println(Alice.getBalance());
    }


// Getter Setters

public Integer getNumber(){
    return this.number;
}

public String getName(){
    return this.name;
}

public Integer getBalance(){
    return this.balance;
}

public void setNumber(Integer number){
    this.number = number;
}

public void setName(String name){
    this.name = name;
}

public void setBalance(Integer balance){
    this.balance = balance;
}
// End of getter setters

public void deposit(Integer amount) {
    this.balance += amount;
}

public void withdraw(Integer amount) {
    this.balance -= amount;
}

public void transfer(Integer amount, bankAccount destination) {
    this.withdraw(amount);
    destination.deposit(amount);
}

}