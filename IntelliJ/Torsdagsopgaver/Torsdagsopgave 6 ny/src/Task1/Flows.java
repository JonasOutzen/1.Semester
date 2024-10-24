package Task1;

public class Flows {

    public void methodA(String input) {

        if (input.length() < 5) {
            System.out.println("input length too short");
        } else {
            System.out.println("j");
            if (!input.equals("start")) {
                System.out.println("a");
                methodB("start");
            } else {
                System.out.println("d");
                System.out.println(methodC(input));

            }
            System.out.println("a");
            methodC(input);
            System.out.println("o");
            methodB(input);
            System.out.println("t");
        }
    }

    public void methodB(String start) {
        System.out.println("v");
    }

    public int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("r");
        if (number >= 5) {
            System.out.println("s");
        }
        System.out.println("j");

    }


}
