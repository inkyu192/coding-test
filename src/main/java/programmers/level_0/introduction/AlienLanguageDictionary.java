package programmers.level_0.introduction;

public class AlienLanguageDictionary {

    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            String temp = dic[i];

            for (int j = 0; j < spell.length; j++) {
                if (spell.length == dic[i].length()) {
                    temp = temp.replaceFirst(spell[j], "");
                }
            }

            if (temp.equals("")) return 1;
        }

        return 2;
    }
}
