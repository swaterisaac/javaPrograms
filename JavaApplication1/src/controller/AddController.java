package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Operation;
import view.View;


public class AddController implements ActionListener{
    
    private View view;
    private Operation model;
    
    //constructor de la clase lleva el mismo nombre
    public AddController(View view, Operation model){
        this.view = view;
        this.model = model;
        this.view.btn1.addActionListener(this);
        this.view.btn2.addActionListener(this);
        this.view.btn3.addActionListener(this);
        this.view.btn4.addActionListener(this);
        this.view.exitbtn.addActionListener(this);
    }
    
    public void initialize(){
        view.setTitle("Calculadora");
        view.setLocationRelativeTo(null);
       
    }
    
    public void actionPerformed(ActionEvent e){
       Object component = e.getSource();
       
       model.setNumber1(view.number1.getText());
       model.setNumber2(view.number2.getText());

    
        if(component == this.view.btn1){
            model.add();
            view.labelOp.setText("+");
        }
        else if (component == this.view.btn2){
            model.sub();
            view.labelOp.setText("-");
        }
        else if (component == this.view.btn3){
            model.mult();
            view.labelOp.setText("x");
        }
         else if (component == this.view.btn4){
            model.div();
            view.labelOp.setText("/");
        }
         else if(component == this.view.exitbtn){
             System.exit(0);
         }
        
        view.numberResult.setText(String.valueOf(model.getResult()));
    }
}
