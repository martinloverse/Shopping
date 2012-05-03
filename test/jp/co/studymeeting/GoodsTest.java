package jp.co.studymeeting;

import junit.framework.TestCase;

public class GoodsTest extends TestCase {
    public void testGetPrice() {
        Goods books = new Goods(2000);
        assertEquals(2000, books .getPrice());
    }
}
