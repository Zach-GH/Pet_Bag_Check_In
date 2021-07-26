/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pet;

/**
 *
 * @author Zachary Meisner
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigDecimal;

//attributes with appropriate data structures
public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private static HashMap<String , Pet> dogSpaces = new HashMap<String, Pet>();
    private static HashMap<String , Pet> catSpaces = new HashMap<String, Pet>();
    private int daysStay;
    private BigDecimal amountDue; //BigDecimal used for monetary values
    private int petID; //Value to keep track of pet
    
    //default constructor
    public Pet() {
        petType = "default";
        petName = "default";
        petAge = 0;
        daysStay = 0;
}
    //Setters Getters Accessors Mutators
    public void setPetType(String type) {
        petType = type;
    }
    public void setPetName(String name) {
        petName = name;
    }
    public void setPetAge(int age) {
        petAge = age;
    }
    public static void setDogSpaces(HashMap<String, Pet> dogSpaces) {
        Pet.dogSpaces = dogSpaces;
    }
    public static void setCatSpaces(HashMap<String, Pet> catSpaces) {
        Pet.catSpaces = catSpaces;
    }
    public void setDaysStay(int stay) {
        daysStay = stay;
    }
    public void setAmountDue(BigDecimal amount) {
        amountDue = amount;
    }
    public void setPetID(int ID) {
        petID = ID;
    }
    
    public String getPetType() {
        return petType;
    }
    public String getPetName() {
        return petName;
    }
    public int getPetAge() {
        return petAge;
    }
    public static HashMap<String, Pet> getDogSpaces() {
        return dogSpaces;
    }
    public static HashMap<String, Pet>  getCatSpaces() {
        return catSpaces;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public BigDecimal getAmountDue() {
        return amountDue;
    }
    public int getPetID() {
        return petID;
    }
    
    public static void petCheckIn(String petType, String petName, int petAge, int daysStay) {
        int spaceAvailable = 0;
        boolean newCustomer = true;
        Pet petInfo = null;
        HashMap<String, Pet> space = null;
        
        if (petType.equals("Dog")) {
            petInfo = new DogClass(petType, petName, petAge, daysStay);
            space = Pet.getDogSpaces();
            spaceAvailable = 30 - space.size();
        }
        
        else {
            petInfo = new CatClass(petType, petName, petAge, daysStay);
            space = Pet.getCatSpaces();
            spaceAvailable = 12 - space.size();
            
        }
        
        if (spaceAvailable > 0) {
            //Check for returning customer
            //Checking in HashMap for key
            //If key doesn't exist then Pet is added
            //If key does exist it is updated
            space.put(petName, petInfo);
            
            if (petType.equals("Dog") && daysStay > 2) {
                System.out.println("Groomed? (y/n)");
                Scanner scan = new Scanner(System.in);
                String answer = scan.next();
                if(answer.equalsIgnoreCase("y")) {
                    ((DogClass) petInfo).setGrooming(true);
                    
                }
                
                ((DogClass) petInfo).setDogSpaceNumber(spaceAvailable);
                
            }
            
            int index = 0;
            for (String pet : space.keySet()) {
                index++;
                if (pet.equals(petName)) {break;}
                
            }
            if (petType.equals("Dog")) {
                ((DogClass) petInfo).setDogSpaceNumber(index);
                
            }
            
            else {
                ((CatClass) petInfo).setCatSpaceNumber(index);
                
            }
        }
    }
}

