package rvt;
import java.util.*;

public class books {
    public static void exBooks(){
        Scanner sc = new Scanner(System.in);

        ArrayList <String> title = new ArrayList<>();
        ArrayList <Integer> pageCount = new ArrayList<>();
        ArrayList <Integer> pubYear = new ArrayList<>();

        while (true){ 
            System.out.print("Title(Empty string to stop): ");
            String scTitle = sc.nextLine();
            if (sc.equals("")){
                break;
            }
            title.add(scTitle); 
            System.out.print("Pages: ");
            pageCount.add(Integer.valueOf(sc.nextLine()));
            
            System.out.print("Publication year: ");
            pubYear.add(Integer.valueOf(sc.nextLine()));

        }
        System.out.print("What to display?: ");
        String whatToPrint = sc.nextLine();
        if (whatToPrint.equals("Everything")){
            for (int i = 0; i <title.size(); i++){
                System.out.println("Title: " + (title.get(i)));
                System.out.println("Page count: " + (pageCount.get(i)));
                System.out.println("Publication year: " + (pubYear.get(i)));
            }   
        
        }else if(whatToPrint.equals("Title")){
            for (int i = 0; i <title.size(); i++){
                System.out.println("Title: " + (title.get(i)));
            }
        }else if(whatToPrint.equals("Publication year")){
            for (int i = 0; i <title.size(); i++){
                System.out.println("Publication year: " + (pubYear.get(i)));
            }
        }else if(whatToPrint.equals("Page count")){
            for (int i = 0; i <title.size(); i++){
                System.out.println("Page count: " + (pageCount.get(i)));
            }
        }
}
}