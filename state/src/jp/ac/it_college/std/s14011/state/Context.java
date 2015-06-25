package jp.ac.it_college.std.s14011.state;

/**
 * Created by s14011 on 15/06/25.
 */
public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}
