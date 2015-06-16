package jp.ac.it_college.std.s14011.pdp.responsibilty;

/**
 * Created by s14011 on 15/06/16.
 */
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }else {
            return false;
        }
    }
}
