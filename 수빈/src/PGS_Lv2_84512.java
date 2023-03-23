import java.util.ArrayList;
import java.util.List;

public class PGS_Lv2_84512 {
    static String[] alphabet = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();

    public static int solution(String word) {
        recursive("");
        return list.indexOf(word) + 1;
    }

    static void recursive(String str) {
        if (str.length() == 5) return;

        for (String s : alphabet) {
            list.add(str + s);
            recursive(str + s);
        }
    }
}
