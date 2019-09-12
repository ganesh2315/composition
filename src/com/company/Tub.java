package com.company;

public class Tub {
    private int size;
    private Bubble b;

    public Tub(int size) {
        this.size = size;
        b=new Bubble();
        b.setColor("blue");
        b.setRadius(23);
    }
    public String getBubblecolor()
    {
        return b.getColor();
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
