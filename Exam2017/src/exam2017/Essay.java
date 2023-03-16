/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2017;

/**
 *
 * @author user
 */
public class Essay extends GradedActivity{
    double grammar,spelling,length,content;

    public Essay(double grammar, double spelling, double length, double content) {
        super(grammar+spelling+length+content);
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        
    }
    @Override
    public String toString(){
        return "Essay score:\nGrammar:"+grammar+"\nSpelling:"+spelling+"\nLength:"+length+"\nContent:"+content;
    }
    
    
    
}
