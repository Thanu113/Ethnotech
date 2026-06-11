import java.util.*;
class LinkedList1{
    public static void main(String[] args){
        LinkedList<String> a=new LinkedList<>();
        a.add("thanu");
        a.add("rohi");
        a.add("manasa");
        a.add("harsha");
        System.out.println(a);
        a.remove("manasa");
        System.out.println(a);
        System.out.println(a.contains("rohi"));

        
    }
}

