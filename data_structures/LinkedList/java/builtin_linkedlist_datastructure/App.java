package LinkedList.java.builtin_linkedlist_datastructure;

import java.util.LinkedList;

public class App {
    
    public static void main(String[] args) {
        
        LinkedList<String> dll1 = new LinkedList<>();

        dll1.addFirst("Kandy");
        // result: Kandy
        dll1.addFirst("Colombo");
        // result: Colombo -> Kandy
        dll1.addFirst("Galle");
        // result: Galle -> Colombo -> Kandy
        dll1.addFirst("Ampara");
        // result: Ampara -> Galle -> Colombo -> Kandy

        for(String city: dll1) {
            System.out.println(city);
        }

        dll1.removeFirst();

        for(String city: dll1) {
            System.out.println(city);
        }

        dll1.removeLast();

        for(String city: dll1) {
            System.out.println(city);
        }

        LinkedList<String> dll2 = new LinkedList<>();

        dll2.addLast("Utrecht");
        // result: Utrecht
        dll2.addLast("Eindhoven");
        // result: Utrecht -> Eindhoven
        dll2.addLast("Hague");
        // result: Utrecht -> Eindhoven -> Hague
        dll2.addLast("Amsterdam");
        // result: Utrecht -> Eindhoven -> Hague -> Amsterdam

        for(String city: dll2) {
            System.out.println(city);
        }
    }
}
