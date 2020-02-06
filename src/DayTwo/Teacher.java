package DayTwo;
import java.util.ArrayList;
import java.util.Date;

public class Teacher {
    private String name;
    private ArrayList<Seminar> seminars;

    public Teacher(String name) {
        this();
        this.name = name;
    }

    public Teacher(){
        seminars = new ArrayList<Seminar>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addSeminar(Seminar s){
        seminars.add(s);
    }

    public ArrayList<Seminar> getSeminars(){
        return seminars;
    }

    public boolean isAvailable(Date start, Date finish){
        boolean avaliable = false;


        return avaliable;
    }

}
