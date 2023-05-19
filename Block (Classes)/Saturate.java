/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanced.programming.project;

/**
 *
 * @author hp
 */
    public class Saturate extends Block{

   private double position [];

    public Saturate(double[] posit) {
        super("saturation",1,posit,1);
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }
   
    
}

