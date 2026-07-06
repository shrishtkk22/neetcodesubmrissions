class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> finallist=new ArrayList();

    boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            
            if (visited[i]) {
                continue;
            }
        

    List first =new ArrayList();
    first.add(strs[i]);
    visited[i] = true;

    char[] a=strs[i].toCharArray();
    Arrays.sort(a);

    for (int j = i + 1; j < strs.length; j++) {
                if (visited[j]) {
                    continue;
                }

    
        char []b=strs[j].toCharArray();
        Arrays.sort(b);


        if(Arrays.equals(a,b)){
            first.add(strs[j]);
            visited[j] = true;


        }
    }
    finallist.add(first);
  
}




 return finallist;
    }
}


