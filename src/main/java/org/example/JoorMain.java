package org.example;

import org.joor.Reflect;

import static org.joor.Reflect.onClass;

public class JoorMain {
    public static void main(String[] args) {
        Reflect helloWorld = Reflect.compile(
                "org.example.ParentClass",
                "package org.example;\n" +
                        "\n" +
                        "public class ParentClass {\n" +
                        "\n" +
                        "    public String method() {\n" +
                        "        ChildClass1 childClass1 = new ChildClass1();\n" +
                        "        ChildClass2 childClass2 = new ChildClass2();\n" +
                        "        return childClass1.method1() + childClass2.method2();\n" +
                        "    };\n" +
                        "\n" +
                        "\n" +
                        "    public class ChildClass1 {\n" +
                        "\n" +
                        "        public String method1() {\n" +
                        "            return \"a\";\n" +
                        "        }\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    public class ChildClass2 {\n" +
                        "\n" +
                        "        public String method2() {\n" +
                        "            return \"b\";\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "}").create();

        Object test = helloWorld.call("method").get();

        System.out.println(test);

    }
}