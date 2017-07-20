public class CharCounter {
    private String string;

    public CharCounter(String string) {
        this.string = string;
    }

    public int countChar(char charToCount) {
        char[] chars = this.string.toCharArray();

        int counter = 0;

        for (char c : chars) {
            if (c == charToCount)
                counter++;
        }

        return counter;
    }

    public int countChar2(String charToCount) {
        int counter = 0;

        for (int i = 0; i < this.string.length(); i++) {
            if(string.substring(i, i+1).equals(charToCount)) {
                counter++;
            }
        }

        return counter;
    }

    public int countChar3(String charToCount) {
        int counter = 0;
        int index = 0;

        while (this.string.indexOf(charToCount, index) != -1) {
            counter++;
            index = this.string.indexOf(charToCount, index) +1;
        }

        return counter;
    }
}
