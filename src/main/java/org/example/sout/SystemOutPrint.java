package org.example.sout;

public class SystemOutPrint {

    SystemOutPrint() {
        System.out.println("Bos constructor ile sout ready:");
    }

    static {
        System.out.println("Static blok ile sout ready:");
    }

    public static void main(String[] args) {
        System.out.println("Main methodunda sout ready");
        SystemOutPrint s1 = new SystemOutPrint();

    }
}
