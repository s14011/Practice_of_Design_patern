package jp.ac.it_college.std.s14011.pdp.responsibilty;

/**
 * Created by s14011 on 15/06/16.
 */
public class SpecialSupport extends Support{
    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }else {
            return false;
        }
    }
}
