package DayTwo;

public class TestMain {
    public static void main(String[] args) {
        School s1 =new School("Athens", 200);
        School s2 = new School("Marousi",30);

        Teacher t1 = new Teacher("Mitsos");
        Teacher t2 = new Teacher("Giannopoulos");

        Seminar sem1 = new OpenSeminar("Java 7");
        Seminar sem2 = new FundedSeminar("Java 8");

        s1.addTeacher(t1);
        s2.addTeacher(t2);

        System.out.println("School s1");
        for(Teacher t: s1.getTeachers()){
            System.out.println(t.getName());
        }

        System.out.println();

        System.out.println("School s2");
        for(Teacher t: s2.getTeachers()){
            System.out.println(t.getName());
        }
    }
}
