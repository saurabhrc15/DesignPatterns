package CreationalPatterns.Singleton;

public class Logger {
    private static Logger loggerInstance = null;

    private Logger() {}

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }
}
