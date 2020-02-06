package DayTwo;

import java.util.ArrayList;


public class School {

    private String name;
    private int capacity;
    private ArrayList<Teacher> teachers ;


    public School(String name, int capacity) {
        this(); //call default constructor
        this.name = name;
        this.capacity = capacity;
    }

    public School(){
        teachers = new ArrayList<Teacher>(); //initialize
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "School{" + "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

//    public Teacher findSeminarTeacher(Seminar seminar){
//
//        return t1;
//    }


}
