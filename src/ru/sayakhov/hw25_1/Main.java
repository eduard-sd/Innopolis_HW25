package ru.sayakhov.hw25_1;


import java.util.*;

/**
 * public boolean isUnique(Map<String, String> map);
 * <p>
 * Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
 * <p>
 * Для пустой мапы метод возвращает true.
 * <p>
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * <p>
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<String, String>();
        HashMap<String, String> book2 = new HashMap<String, String>();


        book.put("Вася", "Иванов");
        book.put("Петр", "Петров");
        book.put("Виктор", "Сидоров");
        book.put("Сергей", "Савельев");
        book.put("Вадим", "Викторов");
        book.put("Вадик", "Герасимов");

        book2.put("Вася", "Иванов");
        book2.put("Петр", "Петров");
        book2.put("Виктор", "Сидоров");
        book2.put("Сергей", "Савельев");
        book2.put("Вадим", "Викторов");
        book2.put("Антон", "Петров");
        book2.put("Саша", "Викторов");
        book2.put("Вадим3", "Викторов3");

        System.out.println(equalMaps2(book));
        System.out.println(equalMaps2(book2));
        System.out.println();
        System.out.println(equalMaps(book));
        System.out.println(equalMaps(book2));
    }

    public static boolean equalMaps2(HashMap<String, String> book) {
        System.out.println(book.entrySet());
        ArrayList<String> val = new ArrayList<String>();
        for ( Map.Entry<String, String> entry : book.entrySet() ) {
            if (val.contains(entry.getValue())) {
                return false;
            } else {val.add(entry.getValue());}
        }
        return true;
    }

    public static boolean equalMaps(HashMap<String,String> book) {
        System.out.println(book.entrySet());
        Collection<String> list = book.values();
        for(Iterator<String> itr = list.iterator(); itr.hasNext();){
            if(Collections.frequency(list, itr.next())>1) {
                return false;
            }
        }
        return true;
    }
}
