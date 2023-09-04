class ValidAnagram {
  public boolean isAnagram(String s, String t) {
        boolean anagram = false;
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        if(Arrays.equals(sChar, tChar)) {
            anagram = true;
        }
        return anagram;
    }
}
