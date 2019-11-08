import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));  //129
        System.out.println(pitches.size()); //3
        System.out.println(pitches.contains("142"));  //true

        System.out.println(pitches.remove("129")); //true
        System.out.println(pitches.size()); //2
        System.out.println(pitches.remove(0)); //138
    }
}	