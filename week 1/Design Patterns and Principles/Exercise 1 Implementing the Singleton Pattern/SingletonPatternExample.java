public class SingletonPatternExample {
    static class Logger {
        private static Logger singleInstance;
        private Logger() {
            System.out.println("Logger object created");
        }
        public static Logger getInstance() {
            if (singleInstance == null) {
                singleInstance = new Logger();
            }
            return singleInstance;
        }
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");
        if (logger1 == logger2) {
            System.out.println("Same Logger object is used.");
        } else {
            System.out.println("Different Logger objects. Singleton failed.");
        }
    }
}
