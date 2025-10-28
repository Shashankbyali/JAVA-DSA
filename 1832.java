class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] check = new char[26];
        boolean[] checked= new boolean[26];
        int k=0;
        for(int i=97;i<123;i++){
            check[k]=(char)i;
            k++;
        }
        for(int i=0;i<sentence.length();i++){
            for(int j=0;j<check.length;j++){
                if(sentence.charAt(i)==check[j]){
                    checked[j]=true;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(checked[i]==false){
                return false;
            }
        }
        return true;
    }
}
