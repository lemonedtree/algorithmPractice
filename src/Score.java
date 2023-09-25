import java.util.Arrays;
import java.util.List;

public class Score {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(92, 85, 85, 85, 89, 91, 93, 92,90,86,
                91, 93, 96, 90, 90);
        List<Integer> credits = Arrays.asList(1 ,1, 1, 2, 2, 2, 2, 2,
                2 ,2, 2, 2, 2, 2, 2);
        assert scores.size() == credits.size();
        int sumScore = 0;
        int sumCredit = 0;
        for (int i = 0; i < scores.size(); i++) {
            sumScore += scores.get(i) * credits.get(i);
            sumCredit += credits.get(i);
        }
        System.out.println((double) sumScore / (double) sumCredit);
    }
}
