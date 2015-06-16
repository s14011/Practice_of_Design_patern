package jp.ac.it_college.std.s14011.pdp.responsibilty;

/**
 * Created by s14011 on 15/06/16.
 */
public abstract class Support {
    private String name;
    private Support next;
    public Support(String namr) {
        this.name = name;
    }
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        }else if (next != null) {
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }
    public String toString() {
        return "[" + name + "]";
    }
    protected abstract boolean resolve (Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolve by" + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolve.");
    }
}
