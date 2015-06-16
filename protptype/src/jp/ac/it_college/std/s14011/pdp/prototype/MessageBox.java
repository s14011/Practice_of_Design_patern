package jp.ac.it_college.std.s14011.pdp.prototype;

/**
 * Created by s14011 on 15/06/04.
 */
public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " "  + decochar);
        for (int i = 0; i < length + 4; i++){
            System.out.println(decochar);
        }
        System.out.println("");
    }
    public Product createClone() {
        Product p = null;

        try {
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
