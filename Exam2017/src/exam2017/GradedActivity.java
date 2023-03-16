/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2017;

/**
 *
 * @author user
 */
public class GradedActivity {
    protected double score;
    public GradedActivity(double score){
        setScore(score);
    }



public void setScore(double score){
    this.score=score;
}
public double getScore(){
    return score;
}

public char getGrade(){
    if(score>=90)return 'A';
    else if (score>=80)return'B';
    else if(score>=70)return'C';
    else if(score>=60)return'D';
    else return 'F';
}
@Override
public String toString(){
    return "Total score: "+getScore()+"\nEssay grade: "+getGrade();
}
}
