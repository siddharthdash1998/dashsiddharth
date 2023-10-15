/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class personDirectory {
    
    //getter and setter
    public ArrayList<Person> getpersonList() {
        return personList;
    }

    public void setpersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    //Array list of class object Person called personList
    
    public ArrayList<Person> personList;
    
    //constructor for personDirectory class
    
    public personDirectory() {
        
        this.personList = new ArrayList<Person>();
        
    }
    
    //maybe consider passing userdirectory here too
    
    public Person addPerson(){
        
        Person person = new Person();
        personList.add(person);
        return person;
        
    }
    
    //public void deletePerson(Person person)
    //{
  
      //  personList.remove(person);
        
    //}
    
    public Person searchPerson(String NUID)
    {
        for(Person person: personList){
            if(person.getNUID().equals(NUID))
            {
                return person;
            }
        }
        
        return null;
    }
    
 
}
