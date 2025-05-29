import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Card implements Comparable<Card> {
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    private int getSuitOrderValue() {
        switch (this.suit.toLowerCase()) {
            case "hearts":
                return 0;
            case "clubs":
                return 1;
            case "diamonds":
                return 2;
            case "spades":
                return 3;
            default:
                return 4;
        }
    }

    private int getNameOrderValue() {
        switch (this.name.toLowerCase()) {
            case "ace":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "jack":
                return 11;
            case "queen":
                return 12;
            case "king":
                return 13;
            default:
                return 14;
        }
    }

    @Override
    public int compareTo(Card other) {
        int suitComparison = Integer.compare(this.getSuitOrderValue(), other.getSuitOrderValue());
        if (suitComparison != 0) {
            return suitComparison;
        }

        return Integer.compare(this.getNameOrderValue(), other.getNameOrderValue());
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}