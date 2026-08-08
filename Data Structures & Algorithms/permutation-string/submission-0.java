class Solution {

    static boolean comparefreq(int[]count1,int[]count2){
        for(int i =0;i<26;i++){
        if(count1[i]!=count2[i]){
            return false;
        }
        
    }
    return true;

    }
    

 


    public boolean checkInclusion(String s1, String s2) {


        if(s1.length() > s2.length()){
            return false;
        }

        int[] count1 = new int[26];
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int index = ch-'a';
            count1[index]++;
        }
         
         int i =0;
         int[] count2 =new int[26];
        int windowlen = s1.length();

        for( i =0;i<windowlen;i++){
            char ch = s2.charAt(i);
            int index2= ch-'a';
            count2[index2]++;
        }

        if(comparefreq(count1,count2)==true){
            return true;

        }

        else{

            while(i<s2.length()){

                char newch = s2.charAt(i);
                int indexnewch = newch-'a';
                count2[indexnewch]++;


                int oldcharin = i-windowlen;
                int oldchar = s2.charAt(oldcharin);
                int freqindexoldchar = oldchar-'a';
                count2[freqindexoldchar]--;


              if(comparefreq(count1,count2)==true){
                return true;
              }
              
              i++;



            }
        }
        return false;
    }
}

        





      






        

        
        
    

    
    
    
