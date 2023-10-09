package ananymousInnerClass;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent(){
            public void suggestDegree(){
                System.out.println("Engineer");
            }

            @Override
            public void benz() {
                //super.benz();
                System.out.println("we have a car...");
            }
        };
        p.suggestDegree();
        p.benz();
        Parent p1 = new Parent();
        p1.suggestDegree();

    }
}
