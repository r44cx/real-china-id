/*
 * Created by Noé Zimmerman, 2017.
 *
 * Free to use :D
 *
 * ISO 7064:1983, MOD 11-2
 * This code is to validate the checksum of a chinese ID.
 * 
 */

//default weight for calculating
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        
        //The calculated number will get the right checknr
        String[] chList = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        
        
        //total and check
        int total = 0;
        String check;
        
        //This is the ID. The last digt is the checksum (0).
        int[] id = {5,1,3,2,0,0,1,9,9,9,0,9,0,6,0,1,9,0};
        
        //Calculates the total 
           for (int i = 0; i < 17; i++) {
               total += id[i] * weight[i];
           
           }
           
           //Gets the CHecknr
           check = chList[total%11];

           //Check if nr = checknr
            if (Integer.parseInt(check)!= id[17]) {
                System.out.println("not valid");
            }else{
            System.out.println("valid/accepted");
            }

        
