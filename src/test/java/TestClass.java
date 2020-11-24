import org.junit.Test;
import core.Student;
import core.Module;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClass {


    @Test
    public void testGetUsername() {
        String[] courses = {"Maths", "Software Engineering 1", "Ethics", "Machine Learning"};
        String johnName = "John";
        int johnAge = 17;

        Student john = new Student(johnName, johnAge, "001", courses);

        String johnsUsername = john.getUsername();
        assertEquals(johnsUsername, johnName + johnAge);
    }

    @Test
    public void testSetAge(){
        String[] courses = {"Maths", "Software Engineering 2", "Thermodynamics", "Materials"};
        String terryName = "Terry";
        int terryAge = 17;

        Student terry = new Student(terryName, terryAge, "002", courses);
        assertTrue(terry.getAge() == terryAge);

        int newAge = 18;
        terry.setAge(newAge);

        assertEquals(terry.getAge(), newAge);

    }

    @Test
    public void testSetModuleName(){
        String[] courses = {"Science", "Mathematics"};
        String[] modules = {"M02", "TH01", "SE01"};
        String moduleName = "Computer Science";
        String moduleId = "M01";

        Module computerScience = new Module(moduleName, moduleId, courses, modules);
        assertTrue(computerScience.getModuleName().equals(moduleName));

        String newName = "Information Technology";
        computerScience.setModuleName(newName);

        assertEquals(computerScience.getModuleName(), newName);

    }
}
