package core;

public class Student {

    private String name, username, dateOfBirth, iD;
    private int age;
    private String[] registeredCourses;

    public Student(String name, int age, String iD, String[] registeredCourses){
        this.name = name;
        this.age = age;
        this.iD = iD;
        this.registeredCourses = registeredCourses;
    }

    public String getUsername(){
        username = name + age;
        return username;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getId(){return iD;}
    public String[] getRegisteredCourses(){return registeredCourses;}

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setId(String iD){this.iD = iD;}

    public void addCourse(String course){registeredCourses[registeredCourses.length] = course;}
//    public void removeCourse(String course){return registeredCourses;}
}
