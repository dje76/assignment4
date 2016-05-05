package assignment4;

/**
 *
 * @author Daniel Eads dje76
 * Tests the email verifier part of the application.
 */
public class test_batch_4 {
    public static void main(String[] args) {
        functions function = new functions();
        
        String email1 = "dad@dad.com";
        String email2 = "daddad.com";
        String email3 = "dad@dadcom";
        String email4 = "dad@dad.";
        String email5 = "@.";
        String email6 = "daddadcom";
        String email7 = "@dad.com";
        String email8 = "@dadcom";
        String email9 = "@dad.commm";
        
        boolean expected1 = true;
        boolean expected2 = false;
        boolean expected3 = false;
        boolean expected4 = false;
        boolean expected5 = false;
        boolean expected6 = false;
        boolean expected7 = false;
        boolean expected8 = false;  
        boolean expected9 = false;
        
        if(expected1 == function.email_verifier(email1)){
            System.out.println("Test 1 PASS");
        }
        else{
            System.out.println("Test 1 FAIL");
        }
        System.out.println("Expected: " + expected1 + " actual: " + function.email_verifier(email1));
        if(expected2 == function.email_verifier(email2)){
            System.out.println("Test 2 PASS");
        }
        else{
            System.out.println("Test 2 FAIL");
        }     
        System.out.println("Expected: " + expected2 + " actual: " + function.email_verifier(email2));
        if(expected3 == function.email_verifier(email3)){
            System.out.println("Test 3 PASS");
        }
        else{
            System.out.println("Test 3 FAIL");
        }        
        System.out.println("Expected: " + expected3 + " actual: " + function.email_verifier(email3));
        if(expected4 == function.email_verifier(email4)){
            System.out.println("Test 4 PASS");
        }
        else{
            System.out.println("Test 4 FAIL");
        }       
        System.out.println("Expected: " + expected4 + " actual: " + function.email_verifier(email4));
        if(expected5 == function.email_verifier(email5)){
            System.out.println("Test 5 PASS");
        }
        else{
            System.out.println("Test 5 FAIL");
        }     
        System.out.println("Expected: " + expected5 + " actual: " + function.email_verifier(email5));
        if(expected6 == function.email_verifier(email6)){
            System.out.println("Test 6 PASS");
        }
        else{
            System.out.println("Test 6 FAIL");
        }
        System.out.println("Expected: " + expected6 + " actual: " + function.email_verifier(email6));
        if(expected7 == function.email_verifier(email7)){
            System.out.println("Test 7 PASS");
        }
        else{
            System.out.println("Test 7 FAIL");
        }   
        System.out.println("Expected: " + expected7 + " actual: " + function.email_verifier(email7));
        if(expected8 == function.email_verifier(email8)){
            System.out.println("Test 8 PASS");
        }
        else{
            System.out.println("Test 8 FAIL");
        }    
        System.out.println("Expected: " + expected8 + " actual: " + function.email_verifier(email8));
        if(expected9 == function.email_verifier(email9)){
            System.out.println("Test 9 PASS");
        }
        else{
            System.out.println("Test 9 FAIL");
        }  
        System.out.println("Expected: " + expected9 + " actual: " + function.email_verifier(email9));
    }
}
