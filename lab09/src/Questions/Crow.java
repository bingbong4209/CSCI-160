/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Tool;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Calvin
 */
public class Crow extends Bird {

    ArrayList<Tool> tools = new ArrayList<>();

    public Crow() {
        super("Jacob", 2008, Color.BLACK);
        tools.add(Tool.CHAINSAW);
    }

    public void addTool(Tool tool) {
        tools.add(tool);
    }

    public ArrayList getToolsUsed() {
        ArrayList<Tool> copy = new ArrayList<>();

        for (int i = 0; i < tools.size(); i++) {
            copy.add(tools.get(i));
        }
        return copy;
    }
    
    public String listToolsUsed() {
        String listOfTools = "";
        for (Tool tool : tools) {
            listOfTools += tool;
        }

        return listOfTools;
    }

    @Override
    public String toString() {
        
        
         
        return name + ", " + getBirthYear() + ", " + getFeatherColor() + ", " + listToolsUsed();
    }
    
}
