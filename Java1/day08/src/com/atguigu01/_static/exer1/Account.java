package com.atguigu01._static.exer1;

public class Account {
  private int number = 1000;
  private int pwd;
  private double balance;
  private static double f;
  private static double miniMoney;

  public Account( int pwd, double balance) {
    this.pwd = pwd;
    this.balance = balance;
    this.number ++;
  }
}
