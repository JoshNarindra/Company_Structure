/*
Manager class extends abstract employee class.
Manager is in charge of Supervisors and Workers.
Role - Type of Manager: administrative, sales, marketing...
 */

public class Manager extends Employee implements Delegate{

    private String role;

    public Manager(String name, int age, int id, String role) {
        super(name, age, id);
        this.role = role;
    }
}
