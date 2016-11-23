public class MovingAverage {

    /** Initialize your data structure here. */
    private List<Integer> window = new LinkedList<Integer>();
    private static int size;
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        
        double result = 0.0;
        if(window.size() == size) window.remove(0);
        window.add(val);
        for(int i =0;i < window.size();i++) result += window.get(i);
        
        return (result/window.size());
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */