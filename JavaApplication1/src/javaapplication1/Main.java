/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import controller.AddController;
import model.Operation;
import view.View;

/**
 *
 * @author veron
 */
public class Main {
    
    public static void main (String[] args){
        
        Operation model = new Operation();
        View view = new View();
        
        AddController control = new AddController(view, model);
        
        control.initialize();
        view.setVisible(true);
    }
}
