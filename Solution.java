class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2)
        {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0 ; i<len1 ; i++)
        {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        for(int i=len1 ; i<len2 ; i++)
        {
            if(Arrays.equals(count1,count2))
            {
                return true;

            }
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i-len1) - 'a']--;
        }
        return Arrays.equals(count1,count2);
    }
    public static void main(String[] args)
    {
        Solution result = new Solution();
        System.out.println(result.checkInclusion("ab","eidbaooo"));
        System.out.println(result.checkInclusion("ab","eidboaoo"));
    }
}