public interface Delegate {
    //Delegation can only be done by Directors, Managers and Supervisors

    default void instruct() {
        System.out.println("Can you do this for me please?");
    }

    private void scold(){
        System.out.println("Bad Job! Take the rest of the day off!");
    }

}
