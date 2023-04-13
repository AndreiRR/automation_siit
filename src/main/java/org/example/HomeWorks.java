package org.example;

public class HomeWorks {

    public static void main(String[] args) {

//        System.out.println("Please enter year between 1900 and 2016");
//        Scanner yearInput = new Scanner(System.in);
//        int year = yearInput.nextInt();
//
//        if (year >= 1900 && year <= 2016) {
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                System.out.println("February have 29 days");
//            } else {
//                System.out.println("February have 28 days");
//            }
//        }
//        String[] values = {"9.0", "/", "3.0"};
//        arithmeticCalculator(values);

//        drawRect(10, 19);
//        drawShapeOutline(5, 8);
        drawCorners(5, 8);

    }

    public static double arithmeticCalculator(String[] args) {
        if (args.length == 3) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            String operator = args[1];

            switch (operator) {
                case "+":
                    System.out.println(a + b);
                    return a + b;
                case "-":
                    System.out.println(a - b);
                    return a - b;
                case "/":
                    System.out.println(a / b);

                    return a / b;
                case "*":
                    System.out.println(a * b);
                    return a * b;
                default:
                    System.out.println(String.format("Not a valid operator %s ", operator));
                    break;
            }
        }
        return 0;
    }

    public static void drawRect(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawShapeOutline(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {

                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawCorners(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if ((i == 0 && j == 0)  //
                        || (i == 0 && j == width - 1) //
                        || (i == height - 1 && j == 0) //
                        || (i == height - 1 && j == width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
