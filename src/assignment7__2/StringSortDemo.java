package assignment7__2; //package definition 
//importing java classes 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class StringSortDemo {
	
	public static void main(String[] args) throws IOException {           //main method starts here
		// TODO Auto-generated method stub

		
			        
			        String temp;
			        
			        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      //creating buffer  
			        
			        System.out.println("Enter the string :");
			        
			        String str=br.readLine();            //taking input
			        
			        String names[] = str.split(" ");        //splitting string 
			        
			        
			        for (int i = 0; i < names.length; i++)   //logic for sorting words in string 
			        {
			            for (int j = i + 1; j < names.length; j++) 
			            {
			                if (names[i].compareTo(names[j])>0) 
			                {
			                    temp = names[i];
			                    names[i] = names[j];
			                    names[j] = temp;
			                }
			            }
			        }
			        System.out.println(" ");
			        
			        //printing sorted words
			        
			        System.out.println("Sorted words : ");
			        for (String string : names) {
						System.out.println(string);
					}
			        
			        
			        
			        for(int i=0;i<names.length;i++){                    //logic for sorting alphabets 
			        	
			        	String test= names[i];
			        	char[] ar = test.toCharArray();
			        	Arrays.sort(ar);
			        	String sorted = String.valueOf(ar);
			        	names[i]=sorted;
			        }
			        
			        System.out.println(" ");
			        
			        //printing final result
			        
			       System.out.println("sorted alphabets in words : "); 
			       
			        for (int i = 0; i < names.length - 1; i++)    //printing output
			        {
			            System.out.print(names[i] + " " );
			        }
			        System.out.print(names[names.length - 1]);


	}
}
