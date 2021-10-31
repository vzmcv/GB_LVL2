package lesson_three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        exercise_one();
        exercise_two();
    }

    public static void exercise_one() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Слово");
        arrayList.add("Слово");
        arrayList.add("Слова");
        arrayList.add("Слова");
        arrayList.add("Два");
        arrayList.add("Два");
        arrayList.add("Два");
        arrayList.add("Три");
        arrayList.add("Три");
        arrayList.add("Три");
        arrayList.add("Тест");
        arrayList.add("Уникальное");

        System.out.println("Массив " + arrayList);
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : arrayList) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

    }

    public static void exercise_two(){
        PhoneBook pb = new PhoneBook();

        pb.add("Иванов", "89071234567");
        pb.add("Петров", "89091123456");
        pb.add("Сидоров", "89123571889");
        pb.add("Козлов", "89021230987");
        pb.add("Федоров", "89041234456");
        pb.add("Сидоров", "89096543212");

        System.out.println(pb.get("Сидоров") );
    }

}
