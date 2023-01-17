package edu.ucsd.cse110.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

import androidx.test.core.app.ActivityScenario;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayStr() {

        assertEquals("1.234", Utilities.trimDisplayStr("1.2340"));
        assertEquals("13", Utilities.trimDisplayStr("13.0"));
    }

}