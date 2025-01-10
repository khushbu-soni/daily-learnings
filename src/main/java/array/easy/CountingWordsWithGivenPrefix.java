package array.easy;

public class CountingWordsWithGivenPrefix {

    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};

        String pref="at";

        int i = countThePrefix(words, pref);
        System.out.println(i);
    }

    public static int countThePrefix(String[] words, String pref){

        int count=0;
        for (String word : words) {
            if(word.startsWith(pref))
                count++;
        }
        return count;
    }
}
