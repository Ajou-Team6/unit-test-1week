import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    //null을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    // 종인
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Null Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
    }

    // 주호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input_By_Juho(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Null Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
        System.out.println("null 값은 0으로 출력 완료!");
    }

    // 명수
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input_By_Myungsoo(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Null Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
        System.out.println("Expected value has completely returned");
    }

    // 연호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input_By_Younho(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Null Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertTrue(numberOfUpperCaseCharactersInString == 0);
        System.out.println("Expected value has completely returned");
    }


    //빈값을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    // 종인
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Empty String Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
    }

    // 주호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input_By_Juho() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Empty String Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
        System.out.println(" 빈 값은 0으로 출력 완료!");
    }

    // 명수
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input_By_Myungsoo() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Empty String Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertEquals(0, numberOfUpperCaseCharactersInString);
        System.out.println("Expected value '0' has completely returned");
    }

    // 연호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input_By_Younho() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Empty String Test: Expected: 0, Actual: " + numberOfUpperCaseCharactersInString);
        assertTrue(numberOfUpperCaseCharactersInString == 0);
        System.out.println("Expected value '0' has completely returned");
    }

    //대문자들이 포함된 문자열을 전달했을 때 카운팅된 숫자와 맞는지 검증하는 테스트 작성
    // 종인
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ABCDEFGHIJ() {
        String str = "ABCDEFGHIJ";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'ABCDEFGHIJ' Test: Expected: 10, Actual: " + numberOfUpperCaseCharactersInString);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 10);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString < 10 || numberOfUpperCaseCharactersInString > 10);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(10));
    }

    // 주호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_RIOTGAMES_BY_JUHO() {
        String str = "RIOTGAMES";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'RIOTGAMES' Test: Expected: 9, Actual: " + numberOfUpperCaseCharactersInString);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 9);

        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString == 6);

        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(9));
    }

    //명수
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ARSENAL_FC_By_Myungsoo() {
        String str = "ARSENAL_FC";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'ARSENAL_FC' Test: Expected: 9, Actual: " + numberOfUpperCaseCharactersInString);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 9);

        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString < 9 || numberOfUpperCaseCharactersInString > 9);

        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(9));
    }

    // 연호
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_9_for_LIVERPOOL_By_Younho() {
        String str = "LIVERPOOL";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'LIVERPOOL' Test: Expected: 9, Actual: " + numberOfUpperCaseCharactersInString);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 9);

        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString < 9 || numberOfUpperCaseCharactersInString > 9);

        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(9));
    }

    //대소문자가 섞여 있을 때 정확히 카운팅 되는 지에 대한 테스트 코드 작성
    // 종인
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'ABCdefGHI' Test: Expected: 6, Actual: " + result);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 6);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result < 6 || result > 6);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(6));
    }

    // 주호
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_RiotGames_By_Juho(){
        String str = "RiotGames";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'RiotGames' Test: Expected: 2, Actual: " + result);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 2);

        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result < 2 || result > 2);

        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(2));
    }

    // 명수
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_ARSeNAL_Fc_By_Myungsoo(){
        String str = "ARSeNAL_Fc";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'ARSeNAL_Fc' Test: Expected: 7, Actual: " + result);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 7);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result < 7 || result > 7);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(7));
    }

    // 연호
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_4_for_LIVErpool_By_Younho(){
        String str = "LIVErpool";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("'LIVErpool' Test: Expected: 7, Actual: " + result);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 4);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result < 4 || result > 7);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(4));
    }

    //잘못된 값을 참조했을 때 IndexOutOfBoundsException Exception이 발생하는지 테스트 코드 작성
    // 종인
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndex() {
        new ArrayList<Object>().get(0);
        System.out.println("IndexOutofBoundsExceptionWhenGetZeroIndex Test Passed!");
    }
    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDivideNumByZero() {
        int A = 10/0;
        System.out.println("shouldThrowExceptionWhenDivideNumByZero Test Passed!");
    }

    // 주호
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndexByJuho() {
        new ArrayList<Object>().get(0);
        System.out.println("배열 범위 벗어났을 때 Exception TEST !");
    }

    // 명수
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndexByMyungsoo() {
        new ArrayList<Object>().get(0);
        System.out.println("Exception TEST - 배열 범위 초과");
    }

    // 연호
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndexByYounho() {
        new ArrayList<Object>().get(0);
        System.out.println("Exception TEST - 배열 범위 초과");
    }

    //해당 메소드가 제한된 시간내에 실행되는지에 대한 테스트 코드 작성 : timeout 사용
    //두번째로 해당 메소드는 테스트 하지 않도록 어노테이션 추가 적용 해봅니다. Ignore
    // 종인
    @Test(timeout = 3000)
    public void testShouldRunInLimitedTime() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("제한된 시간 (3초) 내에 수행되면 테스트 Passed!");
    }

    // 주호
    @Test(timeout = 1000)
    public void testShouldRunInLimitedTimeByJuho() throws InterruptedException {
        Thread.sleep(999);
        System.out.println("제한된 시간 (1초) 내에 수행되면 테스트 Passed!");
    }

    // 명수
    @Test(timeout = 1000)
    public void testShouldRunInLimitedTimeByMyungsoo() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("제한된 시간 (1초) 내에 수행되면 테스트 Passed!");
    }

    // 연호
    @Test(timeout = 3000)
    public void testShouldRunInLimitedTimeByYounho() throws InterruptedException {
        Thread.sleep(2800);
        System.out.println("제한된 시간 (1초) 내에 수행되면 테스트 Passed!");
    }

}
