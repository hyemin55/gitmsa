package org.example;


import java.util.Objects;

class AA {

    private String name;

    public AA(String name) {
        this.name = name;
    }

    public void printThis(Object obj) {
        System.out.println("this = " + this);
        System.out.println("(A)obj = " + (AA) obj);
        System.out.println("this.name = " + this.name);
        System.out.println("(A)obj = " + ((AA) obj).name);
//        System.out.println("(A)obj = "+(A)obj.name);
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((AA) o).name);
    }

}
//    @Override
//public boolean equals(Objects o){
//    }

