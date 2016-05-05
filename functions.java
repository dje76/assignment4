/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Daniel Eads dje76
 * @edited Tyler Winstead tmw293
 */
public class functions {

    public float BMI(float hight, float weight){
        float metric_weight = (float) (weight * 0.45);
        float metric_hight = (float) (hight *0.025);
        
        return (float) Math.pow(metric_hight, 2) / metric_weight;
    }
    
    public float retirement(float goal, float income, float percent, int age){
        float saved_per_year = (float) (income * (percent/100) * 2);
        float years_to_retire = goal/saved_per_year;
        return age + years_to_retire;
    }
    
    public float distance(float x1, float y1, float x2, float y2){
        return (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
<<<<<<< HEAD
    public boolean email_varifier(String email){
        String expression = "(.+)@(.+)\\.(.{1,3})";
=======
    public boolean email_verifier(String email){
        String expression = "(.+)@(.+)\\.(.{1,3})";
>>>>>>> 51da9858a1d22e0120af6a251f53ffe42c7ca319
        Pattern exp = Pattern.compile(expression);
        Matcher m = exp.matcher(email);
        return m.find();
    }
}
