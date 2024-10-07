/* Player.java
* CSCI 111 Fall 2019
* last edited December 12, 2019 by Janay Murphy
*
*
* This code of this simplified Monopoly game is created from the draft copy of Chapter 9
* of Computer Science with Java written by Charles Herbert with assistance from Craig Nelson.
* It was provided to students in CSCI 111 at the Community College of Philadelphia for free in 2019.
*
* This file defines the Player class
* for Player objects in a simplified version of a Monopoly game.
* This Player class will move the Player across a Monopoly board
* The Player class is required for the project to work properly.
*
* This is for teaching purposes only.
* Monopoly and the names and images used in Monopoly are
* registered trademarks of Parker Brothers, Hasbro, and others.
 */

package monopoly;

public class Player {
    //declare properties
    private String name;         //name of the player
    private String token;        //racecar, wheelbarrow, battleship, top hat, etc.
    private int location;        //the number of the square the player is on initialized to 0
    private int balance;         //the player's current bank balance initialized to 1500

    //constructor methods
    public Player() {
        name = "";
        token = "";
        location = 0;
        balance = 0;
    }//end Player()

    public Player(String name, String token, int location, int balance) {
        this.name = name;
        this.token = token;
        this.location = location;
        this.balance = balance;
    }//end Player(String name, String token, int location, int balance)

    //accessor methods
    public String getName(){

        return name;
    }//end getName()

    public String getToken(){

        return token;
    }//end getToken()

    public int getLocation(){

        return location;
    }//end getLocation()

    public int getBalance(){

        return balance;
    }//end getBalance()

    //mutator methods
    public void setName(String name){
        this.name = name;

    }//end setName(String name)

    public void setToken(String token){
        this.token = token;

    }//end setToken(String token)

    public void setLocation(int location){
        this.location = location;

    }//end setLocation(int location)

    public void setBalance(int balance){
        this.balance = balance;

    }//end setBalance(int balance)

    //method to return information about Player as a string
    public String toString() {
        String playerInfo;
        playerInfo = (name + ", " + token + ", " + location + ", " + balance);
        return playerInfo;
    }//end toString()

} //end class Player
//***************************************************************************