package com.example.function.interfaces;

import java.util.Objects;

public class Person implements Comparable<Person>{
	
	private int id;
    private String name;
    private String city;
    
    public Person(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.setCity(city);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", city=" + city + "]\n";
    }
    @Override
    public int compareTo(Person o) 
    {
         return this.id-o.id; //comparing based on id
        
        //return this.name.compareTo(o.name);
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
    }
    

}
