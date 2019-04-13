package PersonProgram;

import java.util.*;

public class PersonProgram {
// Created by Cjfidman

    public static void SortByName(ArrayList<Person> Array){
//Create Comparator "comp" to compare Person Objects
        Comparator<Person> comp = Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER);
//Feed array and "comp" into Sort method to Sort alphabetically
 Collections.sort(Array, comp);
} 

    public static void main(String[] args) {
    
        
   //Fill Array with people and ages for later comparison
    ArrayList<Person> persons = new ArrayList<>();
    persons.add(new Person("Richard", 30));
    persons.add(new Person("Michael", 22));
    persons.add(new Person("Peter", 44));
    persons.add(new Person("Benjamin", 52));
    persons.add(new Person("Kevin", 45));
    persons.add(new Person("Arnold", 32));    
    SortByName(persons);  
    
//Print sorted names to command line
    System.out.println("Sorted Names: ");
    persons.forEach((p) -> {
        System.out.println(p.getName()+", "+p.getAge());
        });
  
    }
    
   
    }
    

class Person {
    String name;
    int age;
    
    public Person(String name){
        this.name=name;
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public  String getName (){
        return this.name;
    }
    public int getAge (){
        return this.age;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}

