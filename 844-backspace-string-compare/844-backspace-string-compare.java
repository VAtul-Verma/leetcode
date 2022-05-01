class Solution {
   public boolean backspaceCompare(String S, String T) {
	assert S != null && T != null;

    // Iterate to find next pair each time
    int i = S.length() - 1;
    int j = T.length() - 1;
    while (i >= 0 || j >= 0) {
        // Skip deleted elements in both strings, until next effective character
        i = skipBackspaceCharacters(S, i);
        j = skipBackspaceCharacters(T, j);

        // Compare character pair
        if (i >= 0 && j >= 0) {
            if (S.charAt(i) != T.charAt(j)) {
                return false;
            }

            i--;
            j--;
        } else if ((i >= 0) != (j >= 0)) {    // Unmatched indices
            return false;
        }
    }

    return true;
}

private int skipBackspaceCharacters(String s, int index) {
    // Simulate stack in & out sequence with counter
    while (index >= 0 && s.charAt(index) == '#') {
        int count = 1;
        index--;

        while (index >= 0 && count > 0) {
            if (s.charAt(index) == '#') {
                count++;
            } else {
                count--;
            }
            index--;
        }
    }

    return index;
}
}