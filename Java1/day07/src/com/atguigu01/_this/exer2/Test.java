package com.atguigu01._this.exer2;


import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    //Customer c=  new Customer("guo", "cheng");
    Account a = new Account(1000);
    //c.setAccount(a);
    a.deposit(1000);
    Bank b = new Bank();
    b.addCustomer("guo", "cheng");
    int n = b.getNumOfCustomers();
    Customer c = b.getCustomer(--n);
    c.setAccount(a);
    System.out.println(b.toString());
    System.out.println(a.toString());
    System.out.println(c.toString());
  }
}

class Account{
  private double balance;
  public Account (double balance){
    this.balance = balance;
  }
  public double getBalance(){
    return this.balance;
  }
  public void deposit(double amt){
    this.balance += amt;
  }
  public void withdraw(double amt){
    if(this.balance > amt){
      this.balance -= amt;
    }else {
      System.out.println("非法");
    }
  }

  @Override
  public String toString() {
    return "Account{" +
            "balance=" + balance +
            '}';
  }
}

class Bank{
  private Customer[] customers;
  private int numberOfCumstomer;

  public Bank() {
    this.customers = new Customer[10];
  }
  public void addCustomer(String f, String l){
    this.customers[this.numberOfCumstomer++] = new Customer(f,l);
  }
  public int getNumOfCustomers(){
    return this.numberOfCumstomer;
  }

  public Customer getCustomer(int index){
    return this.customers[index];
  }

  @Override
  public String toString() {
    return "Bank{" +
            "customers=" + Arrays.toString(customers) +
            ", numberOfCumstomer=" + numberOfCumstomer +
            '}';
  }
}

class Customer {
  private String firstName;
  private String lastName;
  private Account account;

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", account=" + account +
            '}';
  }
}