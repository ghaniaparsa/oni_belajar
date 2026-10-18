package beljar_ets;
public class Course {
    private String courseCode;
    private String title;
    private String instructor;
    private int creditHours;

    public String gettitle(){
        return title;
    }
public void startClass(){
    System.out.println("The course" + title + "is now starting");
}
public void endClass(){
    System.out.println("The course" + title + "is now ending");
}
public void assignTask(){
    System.out.println("The course" + title + "assigning tasks");
}
public void displayInfo(){
System.out.println("Couse Code:" + courseCode + " ," + "Title: " + title + " ," + "Instructor: " + instructor + " ," + "Credit Hours: " + creditHours);
}

}
