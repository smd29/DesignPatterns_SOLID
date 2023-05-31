package oop.LLD.basics;

public class bankAccount {
    private Integer number;
    private String name;
    private Integer balance;

    public bankAccount(Integer number, String name, Integer balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
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