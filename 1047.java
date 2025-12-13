class Solution {
    public String removeDuplicates(String s) {
        if (s.length() == 0) return "";
        char[] arr = new char[s.length()];
        int top = -1;
        arr[++top] = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(top>=0 && (s.charAt(i) == arr[top])){
                top--;
            }else{
                arr[++top] = s.charAt(i);
            }
            
        }
        return new String(arr,0,top+1);
    }
}
