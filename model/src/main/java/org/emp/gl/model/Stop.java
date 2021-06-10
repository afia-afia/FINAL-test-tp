/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.model;

/**
 *
 * @author oussama
 */
public class Stop implements RobotState{
    public String toString(){
        return "Stop";
        
     }

    @Override
    public void up(Robot robot) {
        
        robot.setState(new Up());
    }

    @Override
    public void down(Robot robot) {
        robot.setState(new Down());
    }

    @Override
    public void left(Robot robot) {
        robot.setState(new Left());
    }

    @Override
    public void right(Robot robot) {
        robot.setState(new Right());
    }
    
}
