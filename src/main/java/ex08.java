/*
Exercise 8 - Pizza Party

Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.
Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

Challenges

    Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
    Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
    Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.

*/
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("How many people? ");
        String people = cursor.nextLine();

        System.out.print("How many pizzas do you have? ");
        String pizza = cursor.nextLine();

        System.out.print("How many slices per pizza? ");
        String slices = cursor.nextLine();

        int totalSlices = Integer.parseInt(pizza) * Integer.parseInt(slices);
        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");

        int even = totalSlices/Integer.parseInt(people);
        int r = totalSlices % Integer.parseInt(people);
        System.out.println("Each person gets " + even + " pieces of pizza.");

        System.out.println("There are " + r + " leftover pieces.");
    }
}
