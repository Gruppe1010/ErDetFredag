package com.example.demo.controllers;

import com.example.demo.services.FridayClass; // import
import com.example.demo.services.SimplestCalculater;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// Spring frameworket kalder nu den kode som vi skriver nu - den skal vide det er en controller, og derfor indikerer
// vi det via annotationen @Controller

@Controller
public class MyFirstController
{
    
    @GetMapping("/isItFriday")
    @ResponseBody
    
    public String isItFriday()
    {
        FridayClass fridayClass = new FridayClass();
        
        boolean isItReallyFriday = fridayClass.friday();
        
        if(isItReallyFriday)
        {
            return "YAY, it's Friday";
        }
        
        return "NAY, 'tis not Friday";
    
    }
    
    
    
    
    @GetMapping("/calc")
    @ResponseBody
    public int calc(@RequestParam int inputFromURL)
    {
        SimplestCalculater simplCal = new SimplestCalculater();
        
        return simplCal.returnProduct(inputFromURL);
    }
    /*
    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String phraseToEcho)
    {
        return phraseToEcho; // vil returnerer den streng vi får som parameter
    }
    
     */
    
    /*
    // vi får request ind fra en client som vi gerne vil håndtere - det laver vi en metode til:
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld()
    {
        return "Hello Sweet World";
    }
    
     */
    
    
    
    
}

