package org.example.genericsmethodclass;

public class GenericType<T> {

    private T name;
    private String name2;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public static void main(String[] args) {

        GenericType<String> obj1 = new GenericType<>();
        GenericType<Integer> obj2 = new GenericType<>();

        obj1.setName("Advanced:");

        String str = obj1.getName2();
        System.out.println(str);

        obj2.setName(404);
        Integer num = obj2.getName();
        System.out.println(num);


    }
}
