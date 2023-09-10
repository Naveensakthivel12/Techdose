class MedianFinder {
   PriorityQueue <Integer>maxq;
   PriorityQueue<Integer> minq;
    public MedianFinder() {
        maxq=new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        minq=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxq.offer(num);
        minq.offer(maxq.poll());
        if(maxq.size()<minq.size()) maxq.offer(minq.poll());

    }
    
    public double findMedian() {
        if(maxq.size()==0) return 0;
        return  minq.size() < maxq.size()?maxq.peek():(double)(maxq.peek()+minq.peek())/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
