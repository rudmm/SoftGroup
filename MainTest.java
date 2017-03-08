package com.company;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by michael on 09.03.17.
 */
public class MainTest {
    Main m = new Main();
    @Test
    public void reversString() throws Exception {
        String s1 = "1221";
        boolean b = true;

        String s = m.reversString(s1);
        boolean a = s1.equals(s);

        if(a!=b) Assert.fail();

    }

    @Test
    public void pal() throws Exception {
        String s1 = "паліндром";
        String s2 = m.pal("1221");
        if (s1!=s2) Assert.fail();


    }

}