package com.fm_example.roulette;

public class AnbayashiData {

    private int number;
    private String comment;
    private int add;

    public AnbayashiData(int number, int add, String comment) {
        this.number = number;
        this.add = add;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public String getComment() {
        return comment;
    }

    public int getAdd() {
        return add;
    }

}
