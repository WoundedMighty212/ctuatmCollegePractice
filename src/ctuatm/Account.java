/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctuatm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Albert Michael Ludick
 */
public class Account {
    //fields
    private int id;
    private String userName;
    private double initialBalance;
    private double Balance;
    private Date dateCreated;
    
    //constuctor default
    Account() {}
    
    //constuctor
    Account(int id, String userName, double initialBalance,
            double Balance, Date dateCreated) {
        this.id = id;
        this.userName = userName;
        this.initialBalance = initialBalance;
        this.Balance = Balance;
        this.dateCreated = dateCreated;
    }
    
    //properties of object
    
    //Setters
    public void SetId(int id){
         this.id = id;
    }
    
    public void SetUserName(String userName){
         this.userName = userName;
    }
    
    public void SetInitialBalance(double initialBalance){
         this.initialBalance = initialBalance;
    }
    
    public void SetBalance(double Balance){
        this.Balance = Balance;
    }
    
    public void SetDateCreated(Date dateCreated){
       this.dateCreated = dateCreated;
    }
    
    //getters
    public int GetId(){
        return id;
    }
    
    public String GetUserName(){
        return userName;
    }
    
    public double GetBalance(){
        return Balance;
    }
    
    public double GetInitialBalance(){
        return initialBalance;
    }
    
    public Date GetDateCreated(){
        return dateCreated;
    }
    
    //Methods
    /**
     * this withdraws money out of users account
     * @param amount the amount to withdraw
     */
    public void WIthdraw(double amount){
        if(amount < Balance){
            Balance = Balance - amount;
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficant funds!" 
                    + "Check Balance");
        }
    }
    
    /**
     * this Deposits money into the users account
     * @param amount the amount to deposit
     */
    public void Deposit(double amount){
        if(amount != 10000){
            Balance = Balance + amount;
        }
        else{
            JOptionPane.showMessageDialog(null, "No ammount greater "
                    + "then R10 000 can be deposited please contact" 
                    + "The Bank!");
        }
    }
    
    /**
     * this prints a Statement of the Users Account
     */
    public void PrintStatement(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
                "yyyy/MM/DD HH:mm:ss");
        LocalDateTime timeNow = LocalDateTime.now();
        JOptionPane.showMessageDialog(null, "User: " + GetUserName() 
                + "\nBalance: R " + GetBalance() 
                + "\nDate: " + dtf.format(timeNow));
    }
}
