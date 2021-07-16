package com.Alevel;

public class ID {
    private Integer ID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = (ID * 7 + (ID / 2)) * 14;
    }

    @Override
    public String toString() {
        return "ID = " + ID + " ";
    }
}
