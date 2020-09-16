package com.company;

public class Daughter_Youngest extends Parent implements Printable {

    private String surname;

    public Daughter_Youngest(String name, String surname) {
        super(name);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public void print() {
        System.out.println(" "+getClass().getSimpleName()+
                "\n Имя: " + getName() +
                "\n Фамилия: " + getSurname());
        super.print();
    }
}
