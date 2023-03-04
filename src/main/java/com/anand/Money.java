package com.anand;

public class Money {

    protected int amount;

    public boolean equals(Object o) {
        Money m = (Money) o;
        return m.amount == this.amount;
    }

}
