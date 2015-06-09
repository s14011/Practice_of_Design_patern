package jp.ac.it_college.std.s14011.pdp.builder;

/**
 * Created by s14011 on 15/06/09.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting")
                .makeString("朝から昼にかけて")
                .makeItems(new String[]{
                    "おはようございます。",
                    "こんにちは。",
        });
        builder.makeString("夜に");
        builder.makeItems(new String[]{
                "こんばんは。",
                "おやすみなさい。",
                "さようなら。",
        });
        builder.close();
    }
}
