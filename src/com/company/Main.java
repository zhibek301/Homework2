package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name, please");
        String name = sc.nextLine();
        System.out.println("Enter your age, please");
        int age = sc.nextInt();
        System.out.println("Enter the temperature, please");
        int temperature = sc.nextInt();
        if ((age > 20 || age < 45) && (temperature <-20 || temperature >30)) {

            }  else if (( age < 20) && (temperature > 0 || temperature < 28)){
                System.out.println("не выходит гулять");
            }  else if ((age > 45)&& (temperature > -10 || temperature < 25)) {
                System.out.println("не выходит гулять");
            }  else {
                 System.out.println("идет гулять");
                }
            }

            }





