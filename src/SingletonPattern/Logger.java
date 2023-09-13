package SingletonPattern;

public class Logger {

    private static Logger logger;
    private Logger(){
        System.out.println("Logger Instance Created");
    }
    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
