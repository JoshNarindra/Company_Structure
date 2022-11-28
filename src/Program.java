/*
Main Class
 */
public class Program {
    public static void main(String[] args) {

        Director e = new Director("Narindra",34,21,"Executive Director");

        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getId());
        System.out.println(e.getTitle());

        e.instruct();


    }
}
