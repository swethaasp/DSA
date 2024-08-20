import java.util.Comparator;

/**
 * Comparator that turn strings to lowercase then compare them.
 */
public class AlphabeticComparator implements Comparator<String> {

    public int compare(String first, String second) {
        return first.toLowerCase().compareTo(second.toLowerCase());
    }

}



public class UseAlphabeticComparator {

    public static void main (String [] args) {
        AlphabeticComparator comparator = new AlphabeticComparator();
        System.out.println(comparator.compare("A", "B") < 0); // -> true
        System.out.println(comparator.compare("B", "A") > 0); // -> true

        System.out.println(comparator.compare("a", "B") < 0); // -> true
        System.out.println(comparator.compare("b", "A") > 0); // -> true

        System.out.println(comparator.compare("a", "b") < 0); // -> true
        System.out.println(comparator.compare("b", "a") > 0); // -> true
    }

}
