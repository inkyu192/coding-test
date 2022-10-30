package programmers.introduction.level0;

public class AlienLanguageDictionary {

    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            String s = dic[i];

            if (s.length() == spell.length) {
                boolean flag = true;

                for (int j = 0; j < spell.length; j++) {
                    if (!s.contains(spell[j])) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    answer = 1;
                    break;
                }
            }
        }

        return answer;
    }
}
