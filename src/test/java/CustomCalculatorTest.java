
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    // 종인
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(300,250);
        assertThat(result, is(300+250));
        System.out.println("Add result :: " + result);
    }

    // 주호
    @Test
    public void addByJuho(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(1234,5432);
        assertThat(result, is(6666));
        System.out.println("Add result :: " + result);
    }

    //명수(더하기 테스트)
    @Test
    public void addByMyungsoo(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(14,14);
        assertThat(result, is(14+14));
        System.out.println("Add Result :: " + result);
    }

    // 연호
    @Test
    public void addByYounho(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(3323,2882);
        assertThat(result, is(6205));
        System.out.println("Add Result :: " + result);
    }

    //빼기 테스트 작성
    // 종인
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(222,100);
        assertThat(result, is(222-100));
        System.out.println("Subtract result :: " + result);
    }

    // 주호
    @Test
    public void subtractByJuho() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(1567, 1566);
        assertThat(result, is(23-22));
        System.out.println("Subtract result :: " + result);
    }

    //명수(빼기 테스트)
    @Test
    public void subtractByMyungsoo(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(14,14);
        assertThat(result, is(14-14));
        System.out.println("Subtract Result :: " + result);
    }

    // 연호
    @Test
    public void subtractByYounho(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertThat(result, is(13));
        System.out.println("Subtract Result :: " + result);
    }

    //곱하기 테스트 작성
    // 종인
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(776,432);
        assertThat(result, is(776*432));
        System.out.println("Multiply result :: " + result);
    }

    // 주호
    @Test
    public void multiplyByJuho() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(1,0);
        assertThat(result, is(0*1));
        System.out.println("Multiply result :: " + result);
    }

    //명수(곱하기 테스트)
    @Test
    public void multiByMyungsoo(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(14,14);
        assertThat(result, is(14*14));
        System.out.println("Multiply Result :: " + result);
    }

    // 연호
    @Test
    public void multiByYounho() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5, 9);
        assertThat(result, is(45));
        System.out.println("Multiply Result :: " + result);
    }

    //나누기 테스트 작성
    // 종인
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(110,5);
        assertThat(result, is(110/5));
        System.out.println("Divide result :: " + result);
    }

    // 주호
    @Test
    public void divideByJuho() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(3333,1111);
        assertThat(result, is(9-6));
        System.out.println("Divide result :: " + result);
    }

    //명수(나누기 테스트)
    @Test
    public void divideByMyungsoo(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(14,14);
        assertThat(result, is(14/14));
        System.out.println("Divide Result :: " + result);
    }

    // 연호
    @Test
    public void divideByYounho(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25, 5);
        assertThat(result, is(5));
        System.out.println("Divide Result :: " + result);
    }
}