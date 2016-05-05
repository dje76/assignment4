package assignment4;

/**
 *
 * @author Zachary Kendall zak35 
 *         Jimmy Bailey    jb2188
 * Tests the distance function of the application.
 * NOTE: These tests assume input sanitization (no char, string, etc)
 */
public class test_batch_3 {
    public static void main(String[] args) {
        functions function = new functions();
        
        //creating and populating test case arrays
        float[] testCase1;
        float[] testCase2;
        float[] testCase3;
        float[] testCase4;
        float[] testCase5;
        char[] testCase6;
        int[] testCase7;

        testCase1 = new float[4];
        testCase2 = new float[4];
        testCase3 = new float[4];
        testCase4 = new float[4];
        testCase5 = new float[4];
        testCase6 = new char[4];
        testCase7 = new int[4];

        testCase1[0] = 0;
        testCase1[1] = 10;
        testCase1[2] = 5;
        testCase1[3] = 2;

        testCase2[0] = 0.2f;
        testCase2[1] = 0.03f;
        testCase2[2] = 0.04f;
        testCase2[3] = 0.4f;

        testCase3[0] = 100;
        testCase3[1] = 200;
        testCase3[2] = 1;
        testCase3[3] = 34;

        testCase4[0] = 10;
        testCase4[1] = 5;
        testCase4[2] = 0.6f;
        testCase4[3] = 0.09f;

        testCase5[0] = 0.00003f;
        testCase5[1] = 0.00009f;
        testCase5[2] = 0.00000002f;
        testCase5[3] = 0.0000007f;
        
        testCase6[0] = 'j';
        testCase6[1] = 'i';
        testCase6[2] = 'j';
        testCase6[3] = 'k';
        
        testCase7[0] = 2;
        testCase7[1] = 1;
        testCase7[2] = 1;
        testCase7[3] = 1;

        //pre-calculated values for their respective test cases
        float expected1 = 9.433981f;
        float expected2 = 0.4031129f;
        float expected3 = 193.27959f;
        float expected4 = 10.605098f;
        float expected5 = 0.00009419815f;
        float expected6 = 2.0f;
        float expected7 = 1.0f;

        float calculated1 = (float) function.distance(testCase1[0],testCase1[1],testCase1[2],testCase1[3]);
        float calculated2 = (float) function.distance(testCase2[0],testCase2[1],testCase2[2],testCase2[3]);
        float calculated3 = (float) function.distance(testCase3[0],testCase3[1],testCase3[2],testCase3[3]);
        float calculated4 = (float) function.distance(testCase4[0],testCase4[1],testCase4[2],testCase4[3]);
        float calculated5 = (float) function.distance(testCase5[0],testCase5[1],testCase5[2],testCase5[3]);
        float calculated6 = (float) function.distance(testCase6[0],testCase6[1],testCase6[2],testCase6[3]);
        float calculated7 = (float) function.distance(testCase7[0],testCase7[1],testCase7[2],testCase7[3]);



        //testing accuracy of the function
        if(expected1 == calculated1){
            System.out.println("Test 1 PASS");
        }
        else{
            System.out.println("Test 1 FAIL");
        }
        System.out.println("Expected: " + expected1 + " Actual: " + calculated1 + "\n");
		
        if(expected2 == calculated2){
            System.out.println("Test 2 PASS");
        }
        else{
            System.out.println("Test 2 FAIL");
        }
        System.out.println("Expected: " + expected2 + " Actual: " + calculated2 + "\n");
		
        if(expected3 == calculated3){
            System.out.println("Test 3 PASS");
        }
        else{
            System.out.println("Test 3 FAIL");
        }
        System.out.println("Expected: " + expected3 + " Actual: " + calculated3 + "\n");
	
        if(expected4 == calculated4){
            System.out.println("Test 4 PASS");
        }
        else{
            System.out.println("Test 4 FAIL");
        }
        System.out.println("Expected: " + expected4 + " Actual: " + calculated4 + "\n");

        if(expected5 == calculated5){
            System.out.println("Test 5 PASS");
        }
        else{
            System.out.println("Test 5 FAIL");
        }
        System.out.println("Expected: " + expected5 + " Actual: " + calculated5 + "\n");

        if(expected6 == calculated6){
            System.out.println("Test 6 PASS");
        }
        else{
            System.out.println("Test 6 FAIL");
        }
        System.out.println("Expected: " + expected6 + " Actual: " + calculated6 + "\n");

        if(expected7 == calculated7){
            System.out.println("Test 7 PASS");
        }
        else{
            System.out.println("Test 7 FAIL");
        }
        System.out.println("Expected: " + expected7 + " Actual: " + calculated7 + "\n");

    }
}