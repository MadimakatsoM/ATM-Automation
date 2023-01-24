package org.example;

import java.util.HashMap;
import java.util.Map;


public class ATM_OperationImplementation implements ATM_Operation {
    ATM atm = new ATM();
    Map<Double,String> Statement =new HashMap<>();


    public void viewBalance(){
        System.out.println("Available Balance is : "+atm.getBalance());

    }
    @Override
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount % 500 == 0){
            if (withdrawAmount <= atm.getBalance()){
                Statement.put(withdrawAmount, "Amount Withdrawn");
                System.out.println("Collect the Cash " +
                        withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
               viewBalance();

            }else{
                System.out.println("Insufficient Balance !!");

            }
        }
        else {
            System.out.println("Please Enter another Amount");

        }


    }
    @Override
    public void depositAmount(double depositAmount){
        Statement.put(depositAmount, "Amount deposited");
        System.out.println(depositAmount+ "Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }
    @Override
    public void viewStatement(){
        for(Map.Entry<Double,String> m:Statement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }


}
