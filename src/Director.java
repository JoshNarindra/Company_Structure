/*
Director class extends abstract employee class.
Director is in charge of Managers, Supervisors and Workers.
Title - Types of Director: executive, managing, company, chairman.
 */

public class Director extends Employee implements Delegate{

    private String title;

    public Director(String name, int age, int id, String title) {
        super(name, age, id);
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
