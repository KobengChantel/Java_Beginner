public enum LoggingLevel {
    PENDING(1), PROCESSING(2), PROCESSED(3);

    private int i;
    private LoggingLevel(int i, String s ){
this.i = i;
    }
    public int code(){
        return i;
    }
}
