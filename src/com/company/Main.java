package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
System.out.println("price?");
Double price = input.nextDouble();
double vat = 1.2;
double total = vat *price;
System.out.println("your price + vat is £"+ total);






}
}