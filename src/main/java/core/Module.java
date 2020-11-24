package core;

public class Module {

    private String moduleName, moduleID;
    private String[] associatedCourses, associatedModules;

    public Module(String moduleName, String moduleID, String[] courses, String[] modules){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        associatedCourses = courses;
        associatedModules = modules;
    }

}
