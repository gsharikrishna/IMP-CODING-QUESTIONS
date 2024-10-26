//LEETCODE 1233 
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        String present=folder[0];
        for(String currFol:folder)
        {
            if(!currFol.startsWith(present+'/'))
            {
                res.add(currFol);
                present=currFol;
            }
        }
        return res;
    }
}