package ch06.sec08.exam04;

public class Calculator {
    
    // 정사각형의 넓이 (메서드 오버로딩 1)
    double areaRectangle(double width) {
        // 정사각형은 width * width
        return width * width;
    }
    
    // 직사각형의 넓이 (메서드 오버로딩 2)
    double areaRectangle(double width, double height) {
        // 직사각형은 width * height
        return width * height;
    }
    
}