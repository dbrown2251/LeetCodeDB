class RepeatedSubstringPattern {
  public boolean repeatedSubstringPattern(String s) {

        for(int length = 1; length <= s.length() / 2; length++) {
            if (s.length() % length == 0) {
                String substring = s.substring(0, length);
                StringBuilder constructed = new StringBuilder();

                for (int i = 0; i < s.length() / length; i++) {
                    constructed.append(substring);
                }
                
                if (constructed.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
