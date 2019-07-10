package com.nttdata;

import org.junit.Test;

public class StringOperationTest {
    private StringOperation so;

    @Test
    public void concat() {
        so = new StringOperation();
        assert "abcd".equals(so.concat("ab", "cd"));
    }

    @Test
    public void length() {
        so = new StringOperation();
        assert 5 == so.length("abcde");
    }

    @Test
    public void contains() {
        so = new StringOperation();
        assert so.contains("abcde", "cd");
    }

}