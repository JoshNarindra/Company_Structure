/*
Class employee is an abstract class.
Director, Manager, Supervisor and Worker are all subclasses.
 */

public abstract class Employee {
    private String name;
    private int age;
    private int id;

    public Employee(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //Get name method
    public String getName(){
        return name;
    }

    //Get age method
    public int getAge(){
        return age;
    }

    //Get ID Method
    public int getId(){
        return id;
    }
}
