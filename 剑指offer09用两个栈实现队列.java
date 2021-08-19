import java.util.Stack;

class CQueue {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    public CQueue() {
        this.stack1.clear();
        this.stack2.clear();
    }
    
    public void appendTail(int value) {
        this.stack1.push(value);
       
    }
    
    public int deleteHead() {
        int delete_head = 0;
        if(!this.stack1.empty()&&this.stack2.empty()){
            while(!this.stack1.empty()){
                int temp = (int) this.stack1.pop();
                this.stack2.push(temp);
            }
            delete_head = (int) this.stack2.pop();
        }
        else if(this.stack1.empty()&&!this.stack2.empty()){
            delete_head = (int)this.stack2.pop();
        }
        else if(!this.stack1.empty()&&!this.stack2.empty()){
            delete_head = (int)this.stack2.pop();
        }
        else if(this.stack1.empty()&&this.stack2.empty()){
            delete_head = -1;
        }
        return delete_head;
    }

    public static void main(String [] args)
   {
      /* 以下是不允许的，会引发错误 */
      CQueue cQueue = new CQueue();
      cQueue.appendTail(1);
      cQueue.appendTail(2);
      cQueue.appendTail(3);

      int temp = cQueue.deleteHead();
      System.out.println(temp);
      temp = cQueue.deleteHead();
      System.out.println(temp);

      cQueue.appendTail(4);

      temp = cQueue.deleteHead();
      System.out.println(temp);

      

      temp = cQueue.deleteHead();
      System.out.println(temp);

 
      System.out.println("\n Call mailCheck using Employee reference--");
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */