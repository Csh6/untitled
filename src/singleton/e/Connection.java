package singleton.e;

public class Connection {
    private static Connection connection = new Connection();
    public Connection(){}
    public static Connection getInstance(){
        return connection;
    }
}
