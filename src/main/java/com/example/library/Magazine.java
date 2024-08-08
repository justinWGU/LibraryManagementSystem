package com.example.library;

import java.time.LocalDate;

public class Magazine extends LibraryItem {

    private int ISSN;
    private int issueNum;
    private String editor;

    // constructors
    public Magazine(int ISSN, int issueNum, String editor, String title, LocalDate publicationDate, String genre, int quantity) {
        super(title, publicationDate, genre, quantity);
        this.ISSN = ISSN;
        this.issueNum = issueNum;
        this.editor = editor;
    }

    // getters
    public int getISSN() {
        return ISSN;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public String getEditor() {
        return editor;
    }

    // setters
    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public void displayInfo() {
        System.out.println("");
    }
}
