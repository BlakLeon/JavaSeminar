package DayFour;

public class Ejava {
    public Ejava(){
        this(7);
        System.out.println("Public");
    }
    private Ejava(int val){
        this("Sunday");
        System.out.println("Private");
    }
    protected Ejava(String val){
        System.out.println("Protected");
    }
}
