package DayTwo;

import java.util.Date;

public class OpenSeminar extends Seminar {

    public OpenSeminar(String title, Date start, Date finish) {
        super(title, start, finish); // call the upper constructor (Seminar constructor)!! SUPER ALWAYS FIRST!
    }
    public OpenSeminar(String title) {
        super(title); // call the upper constructor (Seminar constructor)!! SUPER ALWAYS FIRST!
    }
}

