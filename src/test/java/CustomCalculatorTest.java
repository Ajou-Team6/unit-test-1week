
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
        int result = customCalculator.add(10,15);
        assertThat(result, is(10+15));
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

    //빼기 테스트 작성
    // 종인
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertThat(result, is(23-10));
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



    //곱하기 테스트 작성
    // 종인
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);
        assertThat(result, is(5*9));
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

    //나누기 테스트 작성
    // 종인
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        assertThat(result, is(25/5));
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
}