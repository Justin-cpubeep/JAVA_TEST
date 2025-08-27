import java.util.ArrayList;

public class Helloworld {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();


        pitches.add("138");
        pitches.add("129");
        pitches.add("124");

        String one = pitches.get(0);  // 형 변환이 필요없다.
        String two = pitches.get(1);  // 형 변환이 필요없다.

    }
}

