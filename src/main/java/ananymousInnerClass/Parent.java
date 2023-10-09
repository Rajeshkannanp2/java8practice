package ananymousInnerClass;

public class Parent implements Car {
    public void suggestDegree(){
        System.out.println("Doctor");
    }

    @Override
    public void benz() {
        System.out.println("we have a Maruti Car");
    }
}
