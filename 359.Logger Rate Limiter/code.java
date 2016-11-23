public class Logger {
    
    private Map <String, Integer> logfile = new HashMap<String, Integer>();
    /** Initialize your data structure here. */
    public Logger() {
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean result = false;
        if(logfile.containsKey(message)){
            
            if((timestamp - logfile.get(message)) >= 10){
  
                logfile.put(message,timestamp);
                result = true;
            }else{result = false;}
            
        }else {logfile.put(message,timestamp); result = true;}
        
        return result;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */