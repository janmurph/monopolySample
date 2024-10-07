/* BoardSquare.java
 * CSCI 111 Fall 2019
 * last edited December 12, 2019 by Janay Murphy
 *
 * This code of this simplified Monopoly game is taken from the draft copy of Chapter 9
 * of Computer Science with Java written by Charles Herbert with assistance from Craig Nelson.
 * It was provided to students in CSCI 111 at the Community College of Philadelphia for free in 2019.
 *
 * This file defines the BoardSquare class
 * for BoardSquare objects in a simplified version of a Monopoly game.
 * The BoardSquare class is required for the project to work properly.
 *
 * This is for teaching purposes only.
 * Monopoly and the names and images used in Monopoly are
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */

package monopoly;

public class BoardSquare {
    private String name;    // the name of the square
    private String type;    // property, railroad, utility, or community
    private int price;      // cost to buy the square; zero means not for sale
    private int rent;       // rent paid by a player who lands on the square
    private String color;   // many are null; this is not the Java Color class

    // constructors
    public BoardSquare() {
        name = "";
        type = "";
        price = 0;
        rent = 0;
        color = "";
    } // end BoardSquare()

    public BoardSquare(String name, String type, int price, int rent, String color) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rent = rent;
        this.color = color;
    } // end BoardSquare()

    // accessors for each property
    public String getName() {

        return name;
    } //end  getName()

    public String getType() {

        return type;
    } //end  getType()

    public int getPrice() {

        return price;
    } //end  getPrice()

    public int getRent() {

        return rent;
    } //end  getRent()

    public String getColor() {

        return color;
    } //end  getColor()

    // a method to return the BoardSquare's data as a String
    public String toString() {
        String info;
        info = (name + ", " + type + ", " + price + ", " + rent + ", " + color);
        return info;
    } //end  toString()

} // end class BoardSquare
//***************************************************************************
