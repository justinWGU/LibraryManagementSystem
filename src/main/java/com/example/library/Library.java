package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // fields
    private String name;
    private List<LibraryItem> items;
    private List<Member> members;

    // constructors
    public Library(String name) {
        this.name = name;
        items = new ArrayList<>();
        members = new ArrayList<>();
    }
    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }

    // use case functions
    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item: items) { // loop through items list
            if (item.getTitle().equals(title)) { // if title searched is found
                return item; // return whole obj
            }
        }
        return null;
    }

    public Member findMemberByID(String ID) {
        for (Member member: members) {
            if (member.getNumberID() == ID) {
                return member;
            }
        }
        return null;
    }

    public boolean borrowItem(Member member, String title) {
        // search for item by title
        LibraryItem item = findItemByTitle(title);

        // check to see if item is available
        if (item.getQuantity() > 0) {
            // Borrow library item
            //member.borrowItem();
            // reduce item's quantity by 1
            // call mem's borrow func to update borr list
        }
        return false;
    }

    public boolean returnItem(Member member, String id) {
        /*
        // check to see if it is member's list using map.containsKey()
        if (member.getBorrowedItems().containsKey(id)) {
            // if yes, subtract one from quant using map.get() & map.put()
            Integer newVal = member.getBorrowedItems().get(id) + 1;
            member.getBorrowedItems().put(id, newVal);
        }*/

        return false;
    }
    public void addItem(LibraryItem item) { // adds item to the items list
        items.add(item);
    }

    public void removeItem(LibraryItem item) { // removes item to the items list
        items.remove(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void viewAllItems() {
        // loop through items and call display info method
        for (LibraryItem item: items) {
            item.displayInfo();
        }
    }

    public List<Member> viewAllMembers() {
        return members;
    }

    // getters
    public List<Member> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public List<LibraryItem> getItems() {
        return items;

    }


    // setters
    public void setItems(List<LibraryItem> items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
