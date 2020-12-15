package com.company;

import java.util.Scanner;

public class TRIANGLE_ABSTRACT {
    public static void main(String[] args) {
        Triangle graph = new Triangle();
        Scanner input = new Scanner(System.in);

        double side1, side2, side3;
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        input.nextLine();
        String color;
        color = input.next();
        boolean filled;
        filled = input.nextBoolean();

        graph = new Triangle(side1,side2,side3);
        double area = graph.getArea();
        double perimeter = graph.getPerimeter();
        graph.setColor(color);
        graph.setFilled(filled);
        graph.result(area, perimeter);
    }

    public static class Triangle extends GeometricObject{
        private double side1;
        private double side2;
        private double side3;
        private String tircolor;
        private boolean trifilled;

        public Triangle(){
        }

        public Triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public Triangle(double side1, double side2, double side3, String tricolor, boolean trifilled){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            setColor(tricolor);
            setFilled(trifilled);
        }

        @Override
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) *(s - side2) * (s - side3));
        }
        public double getPerimeter(){
            return side1 + side2 + side3;
        }
        public void result(double area, double perimeter){
            System.out.println("Triangle: side1 = " + side1 +" side2 = "+ side2 +" side3 = " + side3);
            System.out.println("The area is " + area);
            System.out.println("The perimeter is " + perimeter);
            System.out.println(getColor());
            System.out.println(isFilled());
        }
    }

    public abstract static class GeometricObject{
        private String color = "white";
        private boolean filled;

        protected GeometricObject(){
        }

        protected  GeometricObject(String color, boolean fill){
            this.color = color;
            filled = fill;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public boolean isFilled(){
            return filled;
        }

        public void setFilled(boolean fill){
            filled = fill;
        }

        public abstract double getArea();

        public abstract double getPerimeter();
    }
}

