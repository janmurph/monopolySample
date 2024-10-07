/* Monopoly.java
 * CSCI 111 Fall 2019
 * last edited December 12, 2019 by Janay Murphy
 *
 * This code of this simplified Monopoly game is taken from the draft copy of Chapter 9
 * of Computer Science with Java written by Charles Herbert with assistance from Craig Nelson.
 * It was provided to students in CSCI 111 at the Community College of Philadelphia for free in 2019.
 *
 * This file contains the executable class Monopoly
 * for a simplified version of a Monopoly game.
 * It requires access to the BoardSquare and Player classes to work properly.
 *
 * The software creates an array for 40 BoardSquares and loads data
 * into the array from a simple text data file
 *
 *It also has code to test the program by printing the data from the array
 *
 * This is for teaching purposes only.
 * Monopoly and the names and images used in Monopoly are
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */

package monopoly;

import java.util.*;

public class Monopoly {

    public static void main(String[] args) throws Exception {
        // create an array for the 40 squares on a Monopoly board
        BoardSquare[] square = new BoardSquare[40]; // array of 40 monopoly squares

        // call the method to load the array
        loadArray(square);

        // test the code by printing the data for each square
        //printArray(square);

        //create instance of the Player class
        Player myPlayer = new Player();

        //initialize Player location to be square 0, the Go square
        myPlayer.setLocation(0);

        //initialize Player name and Token
        myPlayer.setName("Jane");
        myPlayer.setToken("Michael Mouse");

        //initialize Player balance to 1500
        myPlayer.setBalance(1500);

        //print initial data for Player
        System.out.println("****************************************************************");
        System.out.println("The " + myPlayer.getToken() + " is on " + square[myPlayer.getLocation()].getName() + ". ");
        System.out.println(myPlayer.getName() + "'s balance is $" + myPlayer.getBalance() + ".");

        //create a loop to move the player 10 times
        for (int i = 1; i <=10; i++) {
            //pick two random numbers between 1 and 6 to simulate real die
            int die1;
            int die2;
            int roll;         //sum of the two dice
            int newLocation;  //new location of the player after a roll
            int newBalance;   //new balance of the player after a roll

            die1 = 1 + (int) (Math.random() * 6);
            die2 = 1 + (int) (Math.random() * 6);
            roll = die1 + die2;

            //change player location by adding roll value to location
            newLocation = myPlayer.getLocation() + roll;

            //subtract 40 from value if greater than 39
            if (newLocation > 39) {
                newLocation = newLocation - 40;
            }//end if(newLocation > 39)
            myPlayer.setLocation(newLocation);

            //subtract square rent from player balance
            newBalance = myPlayer.getBalance() - square[newLocation].getRent();
            myPlayer.setBalance(newBalance);

            //print message telling the roll of the dice, the new location, its rent and new balance
            System.out.println("****************************************************************");
            System.out.println(myPlayer.getName() + " rolled " + roll + ". ");
            System.out.println("The " + myPlayer.getToken() +  " is on " + square[newLocation].getName() + ". ");
            System.out.println("The rent is $" + square[newLocation].getRent() + ". ");
            System.out.println(myPlayer.getName() + "'s balance now has $" + myPlayer.getBalance());

        }//end for (int i = 1; i <=10; i++)


    } // end main()
    //***********************************************************************

    // method to load the BoardSquare array from a data file
    public static void loadArray(BoardSquare[] sq) throws Exception {

        // declare temporary variables to hold BoardSquare properties read from a file
        // each variable corresponds by name to a property of a BoardSquare object
        String inName;
        String inType;
        int inPrice;
        int inRent;
        String inColor;

        // Create a File class object linked to the name of the file to be read
        java.io.File squareFile = new java.io.File("squares.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(squareFile);

        /* This loop reads data into the array of BoardSquares.
         * Each item of data is a separate line in the file.
         * There are 40 sets of data for the 40 squares.
         */
        for (int i = 0; i < 40; i++) {
            // read data from the file into temporary variables
            // read Strings directly; parse integers
            inName = infile.nextLine();
            inType = infile.nextLine();
            inRent = Integer.parseInt(infile.nextLine());
            inPrice = Integer.parseInt(infile.nextLine());
            inColor = infile.nextLine();

            // initialze each array element  with the BoardSquare initializing  constructor
            sq[i] = new BoardSquare(inName, inType, inPrice, inRent, inColor);

        } // end for
        infile.close();

    } // endLoadArray
    //***********************************************************************

    // test method to print data from the array of BoardSquares
    public static void printArray(BoardSquare[] sq) throws Exception {

        // print header above each row
        System.out.println("Data from the array of Monopoly board squares.\n");
        System.out.printf("%-22s%-12s%6s%6s%14s%n", "name", "type", "price", "rent", "color");
        System.out.println("****************************************************************");

        //  print data in formatted columns, one square per row
        for (int i = 0; i < 40; i++) {
            System.out.printf("%-22s", sq[i].getName());
            System.out.printf("%-12s", sq[i].getType());
            System.out.printf("%6d", sq[i].getPrice());
            System.out.printf("%6d", sq[i].getRent());
            System.out.printf("%14s%n", sq[i].getColor());
        } // end for

    } // end printArray
    //***********************************************************************

} // end class BoardSquare
//***************************************************************************


