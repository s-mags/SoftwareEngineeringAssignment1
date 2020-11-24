package core;

import org.joda.time.DateTime;

public class Course {
    private String courseName;
    private String[] modules, students;
    DateTime startTime, endTime;

    public Course(String courseName, String[] modules, String[] students, DateTime startTime, DateTime endTime){
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCourseName(){return courseName;}
    public String[] getModules(){return modules;}
    public String[] getStudents(){return students;}
    public DateTime getStartTime(){return startTime;}
    public DateTime getEndTime(){return endTime;}

    public void setCourseName(String courseName){this.courseName = courseName;}
    public void addModule(String module){modules[modules.length] = module;}
    public void addStudent(String student){students[students.length] = student;}
    public void setStartTime(DateTime startTime){this.startTime = startTime;}
    public void setEndTime(DateTime endTime){this.endTime = endTime;}

}
