package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        onlyTheseNumbers(); listSize(); onTheList(); removeLast("First","Second","Third");
    }
    public static void onlyTheseNumbers(){
        System.out.println("Only These Numbers");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            Integer a = sc.nextInt();
            if(a == -1){
                break;
            }
            list.add(a);
        }
        //for(int i = 0; i < list.size(); i++){
            //System.out.println(list.get(i));}
        System.out.println("From where? "); 
        int start = sc.nextInt();
        System.out.println("To where? ");
        int end = sc.nextInt();
        System.out.println();
        if(start >= 0 && end < list.size() && start <= end){
            for(int i = start; i <= end; i++){
                System.out.println(list.get(i));
            }
        }
        System.out.println();
    }
    public static void listSize(){
        System.out.println("List Size");
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.isEmpty()){
                break;
            }
            list.add(input);
        }
        System.out.println("In total: " + list.size());
        System.out.println();
    }
    public static void onTheList(){
        System.out.println("On The List");
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.isEmpty()){
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        String search = sc.nextLine();
        if(list.contains(search)){
            System.out.println(search + " was found!");
        } else{
            System.out.println(search + " was not found!");
        }
        System.out.println();
    }
    public static void removeLast(ArrayList<String> strings){
        System.out.println("Remove Last");
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.isEmpty()){
                break;
            }
            list.add(input);
        }
        System.out.println(list);
            if (strings.size() == list.size()+1) {
                return;
        }

            strings.remove(list.size()+1);
        
        System.out.println(list);
        System.out.println();
    }
}
