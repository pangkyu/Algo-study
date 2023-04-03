import java.util.Arrays;

public class PGS_Lv2_42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            if (people[index] + people[i] <= limit) {
                index++;
            }
            answer++;
        }

        return answer;
    }
}