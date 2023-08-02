package com.mycompany.mindmaster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener {
    
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count = 0, current=0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    
    QuizTest(String s){
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0;i<5;i++){
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
        
        
    }
    
    void setData(){
        
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("Q.1 : What is used to find and fix bugs in the Java programs?");
            radioButtons[0].setText("A : JVM");
            radioButtons[1].setText("B : JRE");
            radioButtons[2].setText("C : JDK");
            radioButtons[3].setText("D : JDB");    
        } if(current==1){
            label.setText("Q.2 : Which programming paradigm emphasizes on writing code that is easy to read and maintain?");
            radioButtons[0].setText("A : Procedural Programming");
            radioButtons[1].setText("B : Functional Programming");
            radioButtons[2].setText("C : Object-Oriented Programming");
            radioButtons[3].setText("D : Structured Programming");    
        } if(current==2){
            label.setText("Q.3 : What is the term used for a block of code that is executed repeatedly until a certain condition is met?");
            radioButtons[0].setText("A : Loop");
            radioButtons[1].setText("B : Variable");
            radioButtons[2].setText("C : Condition");
            radioButtons[3].setText("D : Function");    
        } if(current==3){
            label.setText("Q.4 : Which programming language is used for developing Android Apps?");
            radioButtons[0].setText("A : Java");
            radioButtons[1].setText("B : Swift");
            radioButtons[2].setText("C : C#");
            radioButtons[3].setText("D : Python");    
        } if(current==4){
            label.setText("Q.5 : Which of the following is a type of sorting algorithm?");
            radioButtons[0].setText("A : Binary Search");
            radioButtons[1].setText("B : Breadth-First Search");
            radioButtons[2].setText("C : Depth-First Search");
            radioButtons[3].setText("D : Quick Sort");    
        } if(current==5){
            label.setText("Q.6 : Which keyword is used for defining a function in most programming languages?");
            radioButtons[0].setText("A : fun");
            radioButtons[1].setText("B : sub");
            radioButtons[2].setText("C : def");
            radioButtons[3].setText("D : function");    
        } if(current==6){
            label.setText("Q.7 : Which programming language is used for developing iOS Apps?");
            radioButtons[0].setText("A : Java");
            radioButtons[1].setText("B : C++");
            radioButtons[2].setText("C : Python");
            radioButtons[3].setText("D : Swift");    
        } if(current==7){
            label.setText("Q.8 : Which Data Structure is used for implementing a Last-In-First-Out (LIFO) behavior?");
            radioButtons[0].setText("A : Queue");
            radioButtons[1].setText("B : Linked List");
            radioButtons[2].setText("C : Tree");
            radioButtons[3].setText("D : Stack");    
        } if(current==8){
            label.setText("Q.9 : Which of the following is not a programming language?");
            radioButtons[0].setText("A : CSS");
            radioButtons[1].setText("B : HTML");
            radioButtons[2].setText("C : JavaScript");
            radioButtons[3].setText("D : MySQL");    
        } if(current==9){
            label.setText("Q.10 : Which of the following is a type of Web Development Framework?");
            radioButtons[0].setText("A : React");
            radioButtons[1].setText("B : Angular");
            radioButtons[2].setText("C : Django");
            radioButtons[3].setText("D : All of the above");    
        }
        label.setBounds(30, 40, 450, 20);
        for(int i=0,j=0; i<=90; i+=30,j++){
            radioButtons[j].setBounds(50, 80+i, 200, 20);
        }
        
    }
    
    boolean checkAns(){
        
        if(current==0){
           return(radioButtons[3].isSelected()); 
        } if(current==1){
           return(radioButtons[2].isSelected()); 
        } if(current==2){
           return(radioButtons[0].isSelected()); 
        } if(current==3){
           return(radioButtons[0].isSelected()); 
        } if(current==4){
           return(radioButtons[3].isSelected()); 
        } if(current==5){
           return(radioButtons[2].isSelected()); 
        } if(current==6){
           return(radioButtons[3].isSelected()); 
        } if(current==7){
           return(radioButtons[3].isSelected()); 
        } if(current==8){
           return(radioButtons[3].isSelected()); 
        } if(current==9){
           return(radioButtons[3].isSelected()); 
        } 
        
        return false;
    }
    
    public static void main(String[] args){
        
        new QuizTest("MindMaster");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnNext){
            if(checkAns())
                count = count + 1;
                current++;
                setData();
                if(current==9){
                    btnNext.setEnabled(false);
                    btnResult.setVisible(true);
                    btnResult.setText("Result");
                }
        }
        
        if(e.getActionCommand().equals("Result")){
            if(checkAns())
                count = count + 1;
                current++;
                JOptionPane.showMessageDialog(this, "Correct Answers are "+count);
                System.exit(0);
                    
        }
        
    }
    
}
