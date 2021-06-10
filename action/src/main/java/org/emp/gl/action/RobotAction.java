/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.action;

import org.emp.gl.timer.service.TimerChangeListener;

/**
 *
 * @author younes
 */
public interface  RobotAction extends TimerChangeListener{
           public String getState();
           public void doUp();
           public void doDown();
           public void doLeft();
           public void doRight();
           public int getX() ;
           public void setX(int x);
           public int getY();
           public void setY(int y);

}
