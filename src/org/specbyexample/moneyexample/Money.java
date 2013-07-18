package org.specbyexample.moneyexample;
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        return amount == ((Money)object).amount;
    }
}
