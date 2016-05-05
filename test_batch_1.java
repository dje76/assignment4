package assignment4;

/**
 *
 * @author Daniel Eads dje76
 * Tests the BMI part of the application.
 */
public class test_batch_1 {
        public static void main(String[] args) {
        functions function = new functions();
        
        float hight1 = 63;
        float weight1 = 125;
        float hight2 = 80;
        float weight2 = 150;
        float hight3 = 60;
        float weight3 = 180;
        
        float expected1 = (float) 22.7;
        float expected2 = (float) 16.9;
        float expected3 = (float) 36;
        
        float BMI1 = (float) (Math.round(function.BMI(hight1,weight1)*10)/10.0);
        float BMI2 = (float) (Math.round(function.BMI(hight2,weight2)*10)/10.0);
        float BMI3 = (float) (Math.round(function.BMI(hight3,weight3)*10)/10.0);
        
        if(expected1 == BMI1){
            System.out.println("Test 1 PASS");
        }
        else{
            System.out.println("Test 1 FAIL");
        }
        System.out.println("Expected: " + expected1 + " actual: " + BMI1 + "\n");
        if(expected2 == BMI2){
            System.out.println("Test 2 PASS");
        }
        else{
            System.out.println("Test 2 FAIL");
        }    
        System.out.println("Expected: " + expected2 + " actual: " + BMI2 + "\n");
        if(expected3 == BMI3){
            System.out.println("Test 3 PASS");
        }
        else{
            System.out.println("Test 3 FAIL");
        } 
        System.out.println("Expected: " + expected3 + " actual: " + BMI3 + "\n");
    }
}
