class Binary
{
public static void main(String... args) {

    String words[] = { "abc3", "abc2", "abc1", "abc4" };

    Arrays.sort(words);
    System.out.println(Arrays.toString(words));
    {
        String word = "abc3";
        int index = Arrays.binarySearch(words, word);
        index = index >= 0 ? index : -1;
        System.out.println(word + " = " + index);
    }
    {
        String word = "abc11";
        int index = Arrays.binarySearch(words, word);
        index = index >= 0 ? index : -1;
        System.out.println(word + " = " + index);
    }
}
}
