package jp.co.studymeeting;

import junit.framework.TestCase;

public class GoodsTest extends TestCase {
    public void testGetPrice() {
        Goods books = new Goods();
        assertEquals(books .getPrice(), 2000);
    }
}
