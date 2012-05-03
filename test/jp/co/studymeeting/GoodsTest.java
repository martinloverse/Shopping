package jp.co.studymeeting;

import junit.framework.TestCase;

public class GoodsTest extends TestCase {

    public void testGetPrice() {
        Goods books = new Goods(2000);
        assertEquals("単価を求める", 2000, books .getPrice());
    }

    public void testGetTaxesPrice() {
        Goods books = new Goods(2000);
        assertEquals("税込み価格を求める", 2100, books .getTaxesPrice());

        Goods coffee = new Goods(500);
        assertEquals("税込み価格を求める(コーヒー)", 525, coffee .getTaxesPrice());

        Goods tea = new Goods(800);
        assertEquals("税込み価格を求める(紅茶)", 840, tea .getTaxesPrice());

    }
}
