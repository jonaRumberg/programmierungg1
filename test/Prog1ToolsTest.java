package test;

import Prog1Tools.IOTools;

public class Prog1ToolsTest {
    public static void main(String[] args) {
        int p = IOTools.readInt("Int: ");
        int i = IOTools.readInt();
        System.out.println(p + i);
    }
}
