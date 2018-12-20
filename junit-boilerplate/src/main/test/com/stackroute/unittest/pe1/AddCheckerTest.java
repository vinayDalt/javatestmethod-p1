package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddCheckerTest {


        AddChecker addChecker = new AddChecker();


    @Test
    public void tearDown() throws Exception {
        assertEquals(10,addChecker.add(5,5));
    }
}