package com.example.demo.services;
import java.time.LocalDate;

public class FridayClass
{
    
    public boolean friday()
    {
        LocalDate currentdate = LocalDate.now();
        
        int q = currentdate.getDayOfMonth();
    
        int year = currentdate.getYear();
        
        int j = year/100;
        int k = year%100; // findder resten
        
        int m = currentdate.getMonthValue();
        
        if(m < 3) // fordi jan = 13, feb = 14
        {
            m += 12;
            k -= 1;
            // evt. ret at den ikke gør det ordentligt jan+feb år 3000
        }
    
        
        int h = (q + (13 * (m + 1)/5) + k + (k / 4) + (j / 4) - (2 * j)) % 7; // eller double?
        
        int d = ((h + 5) % 7) + 1;
        
        if(d == 5)
        {
            return true;
        }
        return false;
    }
    
    
}
