package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        ATM_OperationImplementation opt = new ATM_OperationImplementation();


        int num = random.nextInt(50);

        int atmCell_number = 123456;

        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!");
        System.out.println("enter Atm Cell Number : ");
        int atmCell_Number = in.nextInt();
        System.out.println("Enter Pin: ");
        int atm_pin = in.nextInt();

        if((atmCell_number == atmCell_Number) && (atm_pin == atm_pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Statement\n5.Exit");
                System.out.println("Enter Option : ");
                int option = in.nextInt();
                if (option == 1){
                    opt.viewBalance();

                }

                else if (option == 2){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = in.nextDouble();
                    opt.depositAmount(depositAmount);

                }
                else if (option == 3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = in.nextDouble();
                    opt.depositAmount(depositAmount);

                }
                else if (option == 4){
                    opt.viewStatement();

                }
                else if (option == 5){
                    System.out.println("Collect your Card\n Thank you for using ATM MACHINE");
                    System.exit(0);

                }
                else{
                    System.out.println("Please enter correct option");


                }
            }
        }
        else{
            System.out.println("Incorrect Number or pin ");
            System.exit(0);
        }

    }
}