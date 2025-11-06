package ch06.sec08.exam02;

public class ComputerExample {
    
    public static void main(String[] args) {
        
        // Computer 객체 생성
        Computer myCom = new Computer();
        
        // sum() 메서드 호출 시 매개값 1, 2, 3을 제공하고,
        // 합산 결과를 리턴받아 result1 변수에 대입
        int result1 = myCom.sum(new int[] {1,2,3});
        System.out.println("result1: " + result1);
        
        // sum() 메서드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고,
        // 합산 결과를 리턴받아 result2 변수에 대입
        int result2 = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println("result2: " + result2);
        
        // sum() 메서드 호출 시 배열 변수를 매개값으로 제공
        int[] values = {1, 2, 3};
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);
        
        // sum2() 메서드 호출 시 매개값을 1, 2, 3, 4, 5를 제공하고,
        // 합산 결과를 리턴받아 result4 변수에 대입
        int result4 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println("result4: " + result4);
        
        // sum2() 메서드 호출 시 new int[]로 배열을 직접 생성하여 제공
        // (가변 인자(sum2)는 배열 형태로도 받을 수 있음)
        int result5 = myCom.sum2(new int[] {1, 2, 3, 4, 5});
        System.out.println("result5: " + result5);
    }
    
}