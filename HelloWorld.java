/*  
    David Peacock / SN8583
    CS-401 Software Engineering
    Due: Wed 14 Nov 2018 @ 1:30 PM
    Lab 10: Travis Lab
*/

package helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HelloWorld {


    public static void main(String[] args)
    {
        int matchingIndex;
        
        System.out.println("Hello World");
        
        List<String> stringList = Arrays.asList("Red", "White", "Blue", "Black", "White" );
        
        List<Integer> integerList = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
   
        // Locating first element in String list
        Predicate<String> strPredicate = color->color.equals("Red");
        matchingIndex = linearSearch(stringList, strPredicate);
        System.out.println(matchingIndex);

        // Locating third element in String list
        strPredicate = color->color.equals("Blue");
        matchingIndex = linearSearch(stringList, strPredicate);
        System.out.println(matchingIndex);
        
        // Failure to locate an element in String list
        strPredicate = color->color.equals("Green");
        matchingIndex = linearSearch(stringList, strPredicate);
        System.out.println(matchingIndex);        

        // *****   ***   *****   ***   *****   ***   *****
        
        // Locating first element in Integer list
        Predicate<Integer> integerPredicate = color->color.equals(0);
        matchingIndex = linearSearch(integerList, integerPredicate);
        System.out.println(matchingIndex);

        // Locating seventh element in Integer list
        integerPredicate = color->color.equals(6);
        matchingIndex = linearSearch(integerList, integerPredicate);
        System.out.println(matchingIndex);        
        
        // Failure to locate an element in Integer list
        integerPredicate = color->color.equals(13);
        matchingIndex = linearSearch(integerList, integerPredicate);
        System.out.println(matchingIndex);  
    }

    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(check.test(list.get(i)))
            { 
                return i;
            }      
        }
        return -1; 
    }   
}
