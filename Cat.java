/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Cat extends Animal{

     public void introduceYourself(){
        
        System.out.println("Meow. I am a cat. My name is " + name);
    }
     
    public Cat(String name) {
       
        super(name);
       
    }

    
}
