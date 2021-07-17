class Solution {
    public String reverseWords(String s) {
        // removes all double spaces and splits each word to the array
        String[] strArray = s.trim().replaceAll("\\s+"," ").split("\\W"); 
        //reset our string since it is stored in m now
        s= "";
        // for the length of the array we will concatenate all strings
        for(int i = 1; i <= strArray.length; i++)
        {
            s+= strArray[strArray.length-i]+" ";
        }
        // return the new string and remove the space at the end of the string
        return s.substring(0, s.length() - 1);
    }
}
