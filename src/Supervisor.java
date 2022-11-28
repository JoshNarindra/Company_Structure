/*
Supervisor class extends abstract employee class.
Supervisor is in charge Workers.
 */

public class Supervisor extends Employee implements Delegate{

    public Supervisor(String name, int age, int id) {
        super(name, age, id);
    }
}
