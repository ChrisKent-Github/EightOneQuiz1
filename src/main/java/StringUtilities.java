
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue      value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + "" + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder stringToBuilder = new StringBuilder();
        stringToBuilder.append(valueToBeReversed);
        stringToBuilder.reverse();
        return String.valueOf(stringToBuilder);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        double stringLength = word.length();
        double lenMed = Math.ceil(stringLength / 2) - 1;
        char middleChar = word.charAt((int) lenMed);
        return middleChar;
    }

    /**
     * @param value        value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int charCounter = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == charToRemove) {
                charCounter++;
            }
        }
        for (int i = 0; i < charCounter; i++) {
            int charToInt = charToRemove;
            int charIndex = value.indexOf(charToInt);
            StringBuilder stringToBuilder = new StringBuilder(value);
            stringToBuilder = stringToBuilder.deleteCharAt(charIndex);
            value = stringToBuilder.toString();
        }
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int indexSave = 0;
        for (int i = sentence.length() - 1; i > 0; i--) {
            char charChk = sentence.charAt(i);
            if (charChk == ' ') {
                indexSave = i;
                break;
            }
        }
        sentence = sentence.substring(indexSave + 1, sentence.length());
        return sentence;
    }
}
