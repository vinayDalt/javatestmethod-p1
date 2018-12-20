package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {

    Pattern pattern;

    @Test
    public void tearDown() throws Exception {
        pattern = new Pattern();
        int[] num={1,2,2,3,3,3,4,4,4,4};
        int [] numin;
        numin=pattern.pattern(4);
        for(int i=0;i<10;i++){
        assertEquals(num[i],numin[i]);}
    }
}