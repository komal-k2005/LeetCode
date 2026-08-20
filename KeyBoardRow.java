public class KeyBoardRow{
    public String[] findWords(String[] words) {

        HashSet<Character> row1 = new HashSet<>(
            Arrays.asList('q','w','e','r','t','y','u','i','o','p')
        );

        HashSet<Character> row2 = new HashSet<>(
            Arrays.asList('a','s','d','f','g','h','j','k','l')
        );

        HashSet<Character> row3 = new HashSet<>(
            Arrays.asList('z','x','c','v','b','n','m')
        );

        List<String> l = new ArrayList<>();

        for (String s : words) {

            String str = s.toLowerCase();
            boolean valid = true;

            HashSet<Character> row;

            if (row1.contains(str.charAt(0))) {
                row = row1;
            } 
            else if (row2.contains(str.charAt(0))) {
                row = row2;
            } 
            else {
                row = row3;
            }

            for (char c : str.toCharArray()) {
                if (!row.contains(c)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                l.add(s);
            }
        }

        return l.toArray(new String[0]);
    }

}