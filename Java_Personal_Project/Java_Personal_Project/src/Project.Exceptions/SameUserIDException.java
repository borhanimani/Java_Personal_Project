/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Borhan
 */
public class SameUserIDException extends Exception {

    private int userID;

    public SameUserIDException(int id) {
        this.userID = id;
    }

    public String toString() {
        return "Same UserID: " + this.userID + " ,Please use another ID.";
    }
}
