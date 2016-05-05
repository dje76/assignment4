package assignment4;

/**
 * @author Tyler Winstead tmw293
 * Tests the retirement requirement of the application.
 * First 3 tests should pass, and the fourth should fail due to death.
 */

public class test_batch_2 {
    public static void main(String[] args) {
        functions function = new functions();
        
        float goal1 = 401000;
        float income1 = 100000;
        float percent1 = 10;
        int age1 = 40;
        
        
        float goal2 = 500000;
        float income2 = 150000;
        float percent2 = 12;
        int age2 = 45;
        
        float goal3 = 1000000;
        float income3 = 200000;
        float percent3 = 15;
        int age3 = 50;
        
        float goal4 = 5000000;
        float income4 = 200000;
        float percent4 = 15;
        int age4 = 55;
        
        int expected1 = 60;
        int expected2 = 58;
        int expected3 = 66;
        int expected4 = 138;
        
        int retire_age1 = (int) function.retirement(goal1, income1, percent1, age1);
        int retire_age2 = (int) function.retirement(goal2, income2, percent2, age2);
        int retire_age3 = (int) function.retirement(goal3, income3, percent3, age3);
        int retire_age4 = (int) function.retirement(goal4, income4, percent4, age4);
        
        if (retire_age1 == expected1 && retire_age1 < 100) {
            System.out.println("Test 1: PASSED");
        }
        else {
            System.out.println("Test 1: FAILED");
            if (retire_age2 >= 100) {
                System.out.println("Deceased");
            }
        }
        System.out.println("Expected: " + expected1 + "\tActual: " + retire_age1 + "\n");

        if (retire_age2 == expected2 && retire_age2 < 100) {
            System.out.println("Test 2: PASSED");
        }
        else {
            System.out.println("Test 2: FAILED");
            if (retire_age2 >= 100) {
                System.out.println("Deceased");
            }
        }
        System.out.println("Expected: " + expected2 + "\tActual: " + retire_age2 + "\n");
        
        if (retire_age3 == expected3 && retire_age3 < 100) {
            System.out.println("Test 3: PASSED");
        }
        else {
            System.out.println("Test 3: FAILED");
            if (retire_age3 >= 100) {
                System.out.println("Deceased");
            }
        }
        System.out.println("Expected: " + expected3 + "\tActual: " + retire_age3 + "\n");
    
        if (retire_age4 == expected4 && retire_age4 < 100) {
            System.out.println("Test 4: PASSED");
        }
        else {
            System.out.println("Test 4: FAILED");
            if (retire_age4 >= 100) {
                System.out.println("Deceased");
            }
        }
        System.out.println("Expected: " + expected4 + "\tActual: " + retire_age4 + "\n");
    }
}
