package com.andersonbadari.minhabiblioteca;

import com.andersonbadari.lib.Utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void lib_should_work() {
        assertEquals(4, Utils.sum(2,2));
    }
}