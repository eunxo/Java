package ch06.sec08.exam02;

public class Computer {
    
    // int 배열을 매개변수로 받는 sum 메서드
    int sum(int[] values) {
        // sum 값을 저장할 변수
        int sum = 0;
        
        // 매개변수로 받은 배열의 모든 원소를 더함
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        
        // 합산 결과를 리턴
        return sum;
    }
    
    // 가변 인자를 매개변수로 받는 sum 메서드
    int sum2(int ... values) {
        // sum 값을 저장할 변수
        int sum = 0;
        
        // 매개변수로 받은 가변 인자(배열처럼 처리됨)의 모든 원소를 더함
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        
        // 합산 결과를 리턴
        return sum;
    }
    
}