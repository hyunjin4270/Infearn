package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("==단어 입력 단계==");
        Map<String, String> words = inputWords();
        System.out.println("==단어 검색 단계==");
        outputWords(words);
    }

    private static Map<String, String> inputWords() {
        Map<String, String> map = new HashMap<>();
        while (true) {
            System.out.print("영어 단어를 입력하세요: (종료는 q): ");
            String[] word = new String[2];
            word[0] = scanner.nextLine();
            if (word[0].equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            word[1] = scanner.nextLine();
            map.put(word[0], word[1]);
        }
        return map;
    }

    private static void outputWords(Map<String, String> map) {
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }
            if (!map.containsKey(word)) {
                System.out.println(word + "은(는) 사전에 없는 단어입니다.");
                continue;
            }
            System.out.println(word + "의 뜻: " + map.get(word));

        }
    }
}