package assignment4;

/**
 *
 * @author Zachary Kendall zak35
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
		
		testCase1 = new float[4];
		testCase2 = new float[4];
		testCase3 = new float[4];
		testCase4 = new float[4];
		
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
		
		testCase4[0] = 0.00003f;
		testCase4[1] = 0.00009f;
		testCase4[2] = 0.00000002f;
		testCase4[3] = 0.0000007f;
		
		//pre-calculated values for their respective test cases
		float expected1 = 9.434f;
		float expected2 = 0.403f;
		float expected3 = 193.280f;
		float expected4 = 10.605f;
		float expected5 = 0.0000942f
		
		float calculated1 = (float) function.distance(testCase1);
		float calculated2 = (float) function.distance(testCase2);
		float calculated3 = (float) function.distance(testCase3);
		float calculated4 = (float) function.distance(testCase4);
		float calculated5 = (float) function.distance(testCase5);
		
        
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
        
    }
}