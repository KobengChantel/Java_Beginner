public enum LoggingLevel {
    PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, ""), Error(4, "");

    private int i;
    private LoggingLevel(int i, String s ){
this.i = i;
this.s = s;
    }
    public int code(){
        return i;
    }
    public boolean isPending(){
        return this== PENDING;
    }
    public boolean isPROCESSED(){
        return this== PROCESSED;
    }
    public boolean isPROCESSING(){
        return this== PROCESSING;
    }
}
