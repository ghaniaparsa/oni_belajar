package beljar_ets;
public class OnlineCourse extends Course{
    private String platform;

    public void connectToPlatform (){
        System.out.println("The online course" + gettitle() + "is connecting to" + platform);
    }
}