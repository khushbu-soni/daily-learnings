package array.easy;

import java.util.*;

public class WordSubset {

    public static void main(String[] args) {
       String[] words1 = {"apple","amazon"};
       String[] words2 = {"l","e"};

        List<String> strings = wordsSubset(words1, words2);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static List<String> wordsSubset(String[] words1, String[] words2){
        ArrayList<String> list=new ArrayList();

//        Create a map of words2

        HashMap<Character,Integer> wordsTwoMaxFreq=new HashMap<>();

        for (String s : words2) {
            HashMap<Character,Integer> freqMap= buildFreqMap(s);
            for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
                char c=entry.getKey();
                int freq= entry.getValue();
                wordsTwoMaxFreq.put(c,Math.max(wordsTwoMaxFreq.getOrDefault(c,0),freq));

            }

        }



        for (String s : words1) {
            HashMap<Character, Integer> words1MapFreq = buildFreqMap(s);
            if(isSubset(words1MapFreq,wordsTwoMaxFreq)){
                list.add(s);
            }

        }

        return list;

    }

    private static HashMap<Character, Integer> buildFreqMap(String s) {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);

        }
        return freqMap;
    }

    public static boolean isSubset(Map<Character,Integer> words1MapFreq,Map<Character,Integer> wordsTwoMapFreq) {

        for (Map.Entry<Character, Integer> entry : wordsTwoMapFreq.entrySet()) {
            char key = entry.getKey();
            int requiredFreq = entry.getValue();
            int availableFreq = words1MapFreq.getOrDefault(key, 0);

            if (availableFreq < requiredFreq) {
                return false; // Exits the method or block where this is used
            }


        }
        return true;
    }
}
