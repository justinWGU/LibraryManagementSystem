package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // fields
    private List<LibraryItem> items;
    private List<Member> members;

    // constructors
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
        // search for item by title & check to see if item is available
        for (LibraryItem item: items) {

            if (item.getTitle().equals(title) && item.getQuantity() > 0) {
                // call items borrow function to update quant
                item.borrowItem();
                // call mem's borrow func to update borr list
                member.borrowItem(item.getId());

                return true;
            }
        }
        return false;
    }

    public boolean returnItem(Member member, String id) {

        // check to see if it is member's list using map.containsKey()
        if (member.getBorrowedItems().containsKey(id)) {
            // if yes, subtract one from quant using map.get() & map.put()
            Integer newVal = member.getBorrowedItems().get(id) + 1;
            member.getBorrowedItems().put(id, newVal);
        }

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

    public List<LibraryItem> viewAllItems() {
        return items;
    }

    public List<Member> viewAllMembers() {
        return members;
    }

    // getters
    public List<Member> getMembers() {
        return members;
    }

    public List<LibraryItem> getItems() {
        return items;
    }


    // setters
    public void setItems(List<LibraryItem> items) {
        this.items = items;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
