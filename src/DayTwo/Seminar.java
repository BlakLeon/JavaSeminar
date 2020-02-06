package DayTwo;
import java.util.Date;

public class Seminar {
    private String title;
    private Date start;
    private Date finish;
    private Teacher seminarTeacher;
    public final int announced =1;
    public final int confirmed =2;

    public Seminar(String title, Date start, Date finish) {
        this.title = title;
        this.start = start;
        this.finish = finish;
    }

    public Seminar(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Teacher getSeminarTeacher() {
        return seminarTeacher;
    }

    public void setSeminarTeacher(Teacher seminarTeacher) {
        this.seminarTeacher = seminarTeacher;
    }

    @Override
    public String toString() {
        return "Seminar{" +
                "title='" + title + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }

    public int getState(){
        return 5;
    }
}
