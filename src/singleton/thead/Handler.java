package singleton.thead;

import java.util.HashSet;
import java.util.Set;

public class Handler implements Runnable{
    Set<Connection> conns = new HashSet<>();

    public Set<Connection> getConns() {
        return conns;
    }

    public void setConns(Set<Connection> conns) {
        this.conns = conns;
    }
    @Override
    public void run(){
        Connection c = Connection.getInstance();
        conns.add(c);
    }
}
