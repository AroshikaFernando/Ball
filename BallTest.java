package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Computers on 7/11/2016.
 */
public class BallTest {
    @Test
    public void updateTime() throws Exception {

        //Test1
        Ball b1 = new Ball(0.0, 0.0, 2.0, 0.0);
        Ball.updateTime(10.0);
        Ball b2 = new Ball(20.0, 0.0, 2.0, 0.0);

        boolean actual = b1.willCollide(b2);
        boolean expected = true;

        assertEquals(expected , actual);
    }

    @Test
    public void showAll() throws Exception {

    }

    @Test
    public void willCollide() throws Exception {

        //Test 2
        Ball b2 = new Ball(0.0, 0.0, 2.0, 0.0);
        Ball b3 = new Ball(10.0, 0.0, 1.0, 0.0);

        boolean actual1 = b3.willCollide(b2);
        boolean expected1 = false;

        assertEquals(expected1 , actual1);

        //Test3
        Ball b4 = new Ball(100.0, 0.0, 10.0, 0.0);
        Ball b5 = new Ball(100.0, 0.0, 2.0, 30.0);

        boolean actual2 = b5.willCollide(b4);
        boolean expected2 = true;

        assertEquals(expected2 , actual2);
    }

}