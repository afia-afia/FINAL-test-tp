/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.model;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import org.emp.gl.core.lookup.Lookup;

import org.emp.gl.time.service.impl.delegation.TimerServiceImplWithDelegation;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.action.RobotAction;
import org.emp.gl.timer.service.TimerChangeListener;

/**
 *
 * @author oussama
 */

public class Robot extends TimerServiceImplWithDelegation implements RobotAction{
    
    
    
   
    private RobotState state;
    public TimerService ts;
    public int x,y;
    public Robot(){
         super();
        y=2;
        x=0;
        
        state=new Stop();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
    
    public void setState(RobotState state){
        this.state=state;
        
    }
   
    public String getState(){
        return this.state.toString();
    }
    @Override
    public void doUp(){
        
        this.state.up(this);
          
    }
    @Override
    public void doDown(){
         this.state.down(this);
        
    }
    @Override
     public void doLeft(){
         
        this.state.left(this);
         
     }
    @Override
      public void doRight(){
         
        this.state.right(this);
         
     }
    public Object getValue(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        
        
         if(pce.getPropertyName() .equals( TimerChangeListener.SECONDE_PROP)){
           
            switch(this.state.toString()) {
                             case "Left":
                                       this.setX(getX()-1);
   
                                   break;
                             case "Right":
                                        this.setX(getX()+1);
                                   
                                      break;
                                      
                             case "Up":
                                        this.setY(getY()-1);
                                        
                                       break;
                              case "Down":          

                                        this.setY(getY()+1);
                                        
                                       break;
                                      
                                      
                             default:
                                       break;
                      
        }
    }
        
         
    }
}


    

