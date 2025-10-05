class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=Math.min(s.length(),1);
        Set<Character> set=new HashSet<>();
        while(end<s.length())
        {
            char ch=s.charAt(end);
            while(set.contains(ch))
            {
                set.remove(s.charAt(start));
                start+=1;
            }
            set.add(s.charAt(end));
            int size=end-start+1;
            max=Math.max(size,max);
            end++;
        }
        return max;
    }
}