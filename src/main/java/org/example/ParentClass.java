package org.example;

public class ParentClass {

    public String method() {
        ChildClass1 childClass1 = new ChildClass1();
        ChildClass2 childClass2 = new ChildClass2();
        return childClass1.method1() + childClass2.method2();
    };


    public class ChildClass1 {

        public String method1() {
            return "a";
        }

    }

    public class ChildClass2 {

        public String method2() {
            return "b";
        }
    }

}
