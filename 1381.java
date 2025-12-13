class CustomStack {
    public CustomStack(int maxSize) {
        n = maxSize;
        stack = new int[n];
    }
    int n;
    int top = -1;
    int[] stack;
    
    public void push(int x) {
        if(top == n-1){
            return;
        }
        top++;
        stack[top] = x;
        return;
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        return stack[top--];
    }
    
    public void increment(int k, int val) {
        int limit = 0;
        if(k>top+1){
            limit = top+1;
        }else{
            limit = k;
        }
        for(int i=0;i<limit;i++){
            stack[i] = stack[i]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
