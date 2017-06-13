package com.company;

import java.util.ArrayList;

/**
 * Created by Computers on 7/5/2016.
 */
public class Ball {

    //creating array list called Balls
    static ArrayList<Ball>Balls = new ArrayList<>();

    //creating fields
    private  double x;
    private  double y;
    private double speed;
    private double angleOfSpeedWithX;

    public static double Time;            //to update the time
    private int id;                       //to identify the ball
    public static int count = 0;          //to get id number


    //creating constructor called Ball
    public Ball(double x, double y, double speed, double angleOfSpeedWithX) {
        this.x = x;                                            //assigning x in parameter to the x in object
        this.y = y;                                            //assigning y in parameter to the y in object
        this.speed = speed;                                    //assigning speed in parameter to the speed in object
        this.angleOfSpeedWithX = angleOfSpeedWithX;            //assigning angle of speed in parameter to the angle in object

        this.count++;                                          //increase count by one
        this.id  = this.count;                                 //assigning count to the id

        Balls.add(this);                                       //add ball to the array list
    }

    //creating update time method
    public static void updateTime(double time) {

        Time = Time + time;                                    //increase time by given time

        //calculate the position of each ball after the updating time
        for (Ball ball : Balls) {
            ball.x = ball.speed * Math.cos(Math.toRadians(ball.angleOfSpeedWithX)) * time + ball.x;
            ball.y = ball.speed * Math.sin(Math.toRadians(ball.angleOfSpeedWithX)) * time + ball.y;
        }
    }


    //creating showAll method
    public static void showAll() {

        //print the positions (x,y) of each ball
        for (Ball ball : Balls ) {
            System.out.println("Ball" + ball.id + " : (" + ball.x + " ," + ball.y + ")");
        }
    }

    //creating the willCollide method to check whether balls are inside this are collide or not
    public boolean willCollide(Ball ball){

        //check whether position of this ball and ball in object are equal or not
        if(this.x == ball.x && this.y == ball.y){
            return true;
        }else{
            return false;
        }
    }

}
