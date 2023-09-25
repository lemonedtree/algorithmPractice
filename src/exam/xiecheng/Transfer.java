package exam.xiecheng;

import java.util.HashMap;
import java.util.Map;

public class Transfer {
    public static boolean canTransfer(String s, String t) {
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();
        Map<Character, Character> replaceMap = new HashMap<>();

        for(int i = 0; i < str.length; i++) {
            char chOld = str[i];
            char chNew = ttr[i];
            if (!replaceMap.containsKey(chOld)) {
                replaceMap.put(chOld, chNew);
            } else {
                char chReplace = replaceMap.get(chOld);
                if (chReplace != chNew) {
                    return false;
                }
            }
        }
        return true;
    }
}
