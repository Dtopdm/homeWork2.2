package com.company;

public class Daughter_Eldest extends Parent implements Printable {

    private int age;

    public Daughter_Eldest(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println(" "+getClass().getSimpleName()+
                "\n Имя: " + super.getName() +
                "\n Возраст: " + getAge());
        super.print();
    }
}
