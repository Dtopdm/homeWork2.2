package com.company;


public class Son extends Parent implements Printable {

    private int birthYear;

    public Son(String name, int birthYear) {
        super(name);
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public void print() {
        System.out.println(" "+getClass().getSimpleName()+
                "\n Имя: " + getName() +
                "\n Дата рождения: " + getBirthYear());
        super.print();
    }
}
