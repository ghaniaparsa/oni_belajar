import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> countName = new HashMap<>();
         Scanner sc = new Scanner(System.in);
         String name;
         do {
            System.out.println("Enter name:");
            name = sc.nextLine();
              if(countName.containsKey(name)){
                int c = countName.get(name)+1;
                countName.put(name,c);
            } else{

                if(!name.isEmpty()){
                    countName.put(name,1);
                }

            }

        } while (!name.isEmpty());

        for(String names:countName.keySet()){
            System.out.print("Entry [" +names +"] has count "+ countName.get(names));
        }
    }

}