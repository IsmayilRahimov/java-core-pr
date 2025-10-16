package org.example.finalitiy;


public final class ProjectFinal {

    final static int age = 16;

    static final void read() {
        System.out.println("Final method dont Override:");
    }

    static final String eclipse() {
        return "Static method";
    }

    final void mehtodles() {
        if (age > 15) {
            System.out.println("Yasiniz dogrudur:" + age);
        } else {
            System.out.println("Yasinizi dogru qeyd edin:");
        }
        System.out.println("Bu mehtod final mehtoddur:");
    }

}
