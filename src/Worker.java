public class Worker extends Employee{
    private String unionName;

    public Worker(String name, int age, int id, String unionName) {
        super(name, age, id);
        this.unionName = unionName;
    }

    public String getUnionName(){
        return unionName;
    }
}
