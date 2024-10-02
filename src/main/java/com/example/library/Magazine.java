package com.example.library;

import java.time.LocalDate;

public class Magazine extends LibraryItem {

    private long ISSN;
    private int issueNum;
    private String editor;

    // constructors
    public Magazine(long ISSN, int issueNum, String editor, String title, LocalDate publicationDate, String genre, int quantity) {
        super(title, publicationDate, genre, quantity);
        this.ISSN = ISSN;
        this.issueNum = issueNum;
        this.editor = editor;
    }

    // getters
    public long getISSN() {
        return ISSN;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public String getEditor() {
        return editor;
    }

    // setters
    public void setISSN(long ISSN) {
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
        System.out.println("Editor: " + editor);
        System.out.println("ISSN: " + ISSN);
        System.out.println("Issue Number: " + ISSN);
        super.displayInfo();
        System.out.println();
    }
}
