package coursera.sdgwck_algs.tools;

public class StopWatch {
    private long startTime;
    private long elapsedTime;
    private String label;
    
    /** Creates and starts the stop watch. */
    public StopWatch(String label) {
        this.label = label;
        startTime = System.currentTimeMillis();
    }
    
    /** Stops the stop watch and prints elapsed time in milliseconds. */
    public long stopMS() {
        stop();
        System.out.printf("%s : elapsed time %d milliseconds%n", label, getElapsedTimeMS());
        return getElapsedTimeMS();
    }
    
    /** Stops the stop watch and prints elapsed time in seconds. */
    public long stopS() {
        stop();
        System.out.printf("%s : elapsed time %d seconds%n", label, getElapsedTimeS());
        return getElapsedTimeS();
    }
    
    public long getElapsedTimeMS() { return elapsedTime; }
    
    public long getElapsedTimeS() { return elapsedTime / 1000; }
    
    public void stop() {
        elapsedTime = System.currentTimeMillis() - startTime;
    }
}
