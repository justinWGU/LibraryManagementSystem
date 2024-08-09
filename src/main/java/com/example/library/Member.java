package com.example.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Member {

    // priv fields
    private HashMap<String, Integer> borrowedItems;
    private String name;
    private int numberID;
    private String email;
    private int itemQuantity;

    // constructors
    public Member(String name, int numberID, String email) {
        this.name = name;
        this.numberID = numberID;
        this.email = email;
        borrowedItems = new HashMap<>();
    }
    public Member() {
        name = "";
        numberID = 0;
        email = "";
        borrowedItems = new HashMap<>();
    }

    // class specific functions
    public void borrowItem(String id) {

        // get item ID, check to see if the hash table contains
        // the id using boolean hasKey = map.containsKey("key1");
        if (borrowedItems.containsKey(id)) {
            // if yes, add 1 to the value using map.get() & map.put()
            Integer newVal = borrowedItems.get(id) + 1;
            borrowedItems.put(id, newVal);
        }

            // if no, create the mapping using map.put("key1", "value1");
    }

    public void returnItem(String id) {

    }

    public void viewBorrowedItems() {

    }

    // getters
    public HashMap<String, Integer> getBorrowedItems() {
        return borrowedItems;
    }

    public String getName() {
        return name;
    }

    public int getNumberID() {
        return numberID;
    }

    public String getEmail() {
        return email;
    }


    // setters
    public void setBorrowedItems(HashMap<String, Integer> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
