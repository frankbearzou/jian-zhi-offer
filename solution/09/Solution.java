class CQueue {
    private Deque<Integer> in;
    private Deque<Integer> out;

    public CQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }
    
    public void appendTail(int value) {
        in.push(value);
    }
    
    public int deleteHead() {
        if (!out.isEmpty()) {
            return out.pop();
        }
        if (in.isEmpty()) {
            return -1;
        }
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
