/*
 * ChargeAccount class
 */


public class ChargeAccount {
    
    //Establish charge account number array and initialize
    private int[] accountNumbers = {5658845, 4520125, 7895122, 8777541,
                                    8451277, 1302850, 8080152, 4562555,
                                    5552012, 5050522, 7825877, 1250255,
                                    1005231, 6545231, 3852085, 7576651,
                                    7881200, 4581002};
    
    
    
    //The compareAccountNumbers method compares the int argument to the
    //account numbers in the accountNumbers array and determines whether
    //or not the argument is found in the array
    
    public boolean compareAccountNumbers(int num)   {
        
        boolean numberFound = false;
        
        for (int x = 0; x < accountNumbers.length; x++) {
            
            if (num == accountNumbers[x])    {
                
                numberFound = true;
                
            }
            
        }
        
        return numberFound;
        
    }

}
