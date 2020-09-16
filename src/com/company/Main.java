package com.company;

public class Main {

    public static void main(String[] args) {

	createObject("Daughter_Eldest").print();
	createObject("Son").print();
	createObject("Daughter_Youngest").print();



    }

    public static Printable createObject(String className){
        Printable printable = null;
        switch(className){
            case "Daughter_Eldest":
                printable = new Daughter_Eldest("Маша", 23);
                break;
            case "Son":
                printable = new Son("Ваня", 2001);
                break;
            case "Daughter_Youngest":
                printable = new Daughter_Youngest("Лена", "Иванова");
                break;
        };
        return printable;
    }
}
