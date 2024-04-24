package lesson23;

import java.util.HashMap;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Deutschland");
        hashMap.put("BMW", "Deutschland");
        hashMap.put("Lada", "Russland");

        if(hashMap.containsKey("Audi")){
            System.out.println("Audi was found");
        }
        if(hashMap.containsValue("Deutschland")){
            System.out.println("Deutschland was found");
        }

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}


        /*      HashMap<String, String> hashMap = new HashMap<>(); //1-й параметр - это ключ, 2-й это то значение, кот-е привязано к ключу.
        hashMap.put("1", "DE1234567890"); // 1- Надпись на дверце шкафа, DE... - содержимое шкафчика
        hashMap.put("2", "DE2345678901");

        System.out.println(hashMap.get("2"));
        hashMap.put("2","DE990909090");
        System.out.println();
    } */

