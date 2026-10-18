package beljar_ets;

public class OfflineCouse extends Course{
    private String roomNumber;

    public void reserveClassroom(){
        System.out.println("The offline course" + gettitle() + "is reserving classroom" + (roomNumber));
    }
    
}
