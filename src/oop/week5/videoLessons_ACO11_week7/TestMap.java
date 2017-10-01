package oop.week5.videoLessons_ACO11_week7;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        System.out.println("\n--------------HashMap-------------");

        Map<Integer, String> mapHash = new LinkedHashMap<>();

        mapHash.put(1, "Ivan");
        mapHash.put(2, "Petro");
        mapHash.put(33, "Vasia");
        mapHash.put(13, "Kolia");
        mapHash.put(28, "Denys");
        mapHash.put(15, "Oleg");
        System.out.print(mapHash.size());

        String name = mapHash.get(1);

        // how to iterate
        Set<Integer> keys = mapHash.keySet();
        for (Integer key: keys) {
            System.out.printf("\nkey %s, value %s", key, mapHash.get(key));
        }

        Collection<String> values = mapHash.values();

        for (String value : values) {
            System.out.print("\n" + value);
        }

        Set<Map.Entry<Integer, String>> entrySet = mapHash.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.printf("\nkey %s, value %s", entry.getKey(), entry.getValue());
        }

        Map<Integer, String> mapTree = new TreeMap<>();

        mapTree.put(1, "Ivan");
        mapTree.put(2, "Petro");
        mapTree.put(33, "Vasia");
        mapTree.put(13, "Kolia");
        mapTree.put(28, "Denys");
        mapTree.put(15, "Oleg");


        System.out.println("\n\n--------------TreeMap-------------");

        Set<Map.Entry<Integer, String>> entrySetMT = mapTree.entrySet();
        for (Map.Entry<Integer, String> entry : entrySetMT) {
            System.out.printf("\nkey %s, value %s", entry.getKey(), entry.getValue());
        }
    }

}
