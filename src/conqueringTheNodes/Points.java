/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

/**
 *
 * @author Admin
 */
public class Points implements Displayable{
    private int x, y;
    private String name;
    
    Points(String name, int x, int y){
        this.x = x;
        this.y = y;
        this.name = name;
    }
    
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
