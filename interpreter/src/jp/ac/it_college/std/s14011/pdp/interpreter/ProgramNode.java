package jp.ac.it_college.std.s14011.pdp.interpreter;

/**
 * Created by s14011 on 15/06/18.
 */
public class ProgramNode extends Node{
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString() {
        return "[program" + commandListNode + "]";
    }
}
