package jp.ac.it_college.std.s14011.pdp.builder;

/**
 * Created by s14011 on 15/06/09.
 */
/*
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();


    @Override
    public Builder makeTitle(String title) {
        buffer.append("====================\n");
        buffer.append("「" + title + "」\n");
        buffer.append("\n");
        return this;
    }

    @Override
    public Builder makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (int i = 0; i < items.length; i++){
            buffer.append(" ・" + items[i] + "\n");
        }
        buffer.append("\n");
        return this;
    }

    /*@Override
    public Builder close() {
        buffer.append("=========================\n");
        return this;
    }
    public String getResult() {
        return buffer.toString();
    }


}
*/