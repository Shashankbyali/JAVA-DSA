class MinStack {
    int[] st;
    int top;
    int topm;
    int[] min;
    public MinStack() {
        st = new int[30000];
        top = -1;
        topm = -1;
        min = new int[30000];
    }
    
    public void push(int val) {
        st[++top] = val;
        if(topm == -1 || val<=min[topm]){
            min[++topm] = val;
        }
    }
    
    public void pop() {
        if(top == -1){
            return;
        }
        if(st[top] == min[topm]){
            top--;
            topm--;
            return;
        }else{
            top--;
        }
    }
    
    public int top() {
        return st[top];
    }
    
    public int getMin() {
        return min[topm];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
