package jp.ac.it_college.std.s14011.flyweight;


/**
 * Created by s14011 on 15/06/25.
 */
public class BigString {
    private BigChar[] bigchars;

    public BigString(String string){
        bigchars =new BigChar[string.length()];
        BigCharFactory factory =BigCharFactory.getInstance();
        for (int i = 0;i<bigchars.length;i++) {
            bigchars[i] = factory.getBigchar(string.charAt(i));
        }
    }
    public void print() {
        for (BigChar bc : bigchars) {
            bc.print();
        }
    }
}
