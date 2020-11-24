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

    public String getModuleName(){return moduleName;}
    public String getModuleID(){return moduleID;}
    public String[] getAssociatedCourses(){return associatedCourses;}
    public String[] getAssociatedModules(){return associatedModules;}

    public void setModuleName(String name){moduleName = name;}
    public void setModuleID(String iD){moduleID = iD;}
}
