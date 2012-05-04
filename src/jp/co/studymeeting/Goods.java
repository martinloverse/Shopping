package jp.co.studymeeting;

public class Goods {

    private int price;

    public Goods(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getTaxesPrice() {
        return (int)(this.price * 1.05);
    }

}
