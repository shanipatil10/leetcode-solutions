class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> extra;

    public MyStack() {
        main=new LinkedList<>();
        extra=new LinkedList<>();
    }
    
    public void push(int x) {
       
        while(!main.isEmpty()){
            extra.add(main.remove());
        } main.add(x);
        while(!extra.isEmpty()){
            main.add(extra.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        else{
            return false;
        }    
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
