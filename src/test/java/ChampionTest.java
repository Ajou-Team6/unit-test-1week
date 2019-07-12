import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.NotNull;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChampionTest {

    // 종인
    private List<Champion> championList = new ArrayList<Champion>();

    // 주호
    private List<Champion> championListByJuho = new ArrayList<Champion>();

    // 명수
    private List<Champion> championListByMyungsoo = new ArrayList<>();

    // 연호
    private List<Champion> championListByYounho = new ArrayList<Champion>();

    @Before
    public void setUp() {

        // 종인
        Champion topChamp = new Champion("다리우스", "탑");
        Champion jungleChamp = new Champion("리신", "정글");
        Champion midChamp = new Champion("르블랑", "미드");
        Champion adcChamp = new Champion("베인", "바텀");
        Champion supportChamp = new Champion("레오나", "바텀");

        // 주호
        Champion topChampByJuho = new Champion("뽀삐", "탑");
        Champion jungleChampByJuho = new Champion("신짜오", "정글");
        Champion midChampByJuho = new Champion("조이", "미드");
        Champion adcChampByJuho = new Champion("징크스", "바텀");
        Champion supportChampByJuho = new Champion("탐켄치", "바텀");

        //명수
        Champion topChampionByMyungsoo = new Champion("가렌", "탑");
        Champion jungleChampionByMyungsoo = new Champion("다이애나", "정글");
        Champion midChampionByMyungsoo = new Champion("갈리오", "미드");
        Champion adcChampionByMyungsoo = new Champion("소라카", "바텀");
        Champion supportChampionByMyungsoo = new Champion("라칸", "바텀");

        // 종인
        championList.add(topChamp);
        championList.add(jungleChamp);
        championList.add(midChamp);
        championList.add(adcChamp);
        championList.add(supportChamp);

        // 주호
        championListByJuho.add(topChampByJuho);
        championListByJuho.add(jungleChampByJuho);
        championListByJuho.add(midChampByJuho);
        championListByJuho.add(adcChampByJuho);
        championListByJuho.add(supportChampByJuho);

        //명수
        championListByMyungsoo.add(topChampionByMyungsoo);
        championListByMyungsoo.add(jungleChampionByMyungsoo);
        championListByMyungsoo.add(midChampionByMyungsoo);
        championListByMyungsoo.add(adcChampionByMyungsoo);
        championListByMyungsoo.add(supportChampionByMyungsoo);

    }

    // 연호
    @Before
    public void setUpByYounho() {
        Champion topChampionByYounho = new Champion("문도박사", "탑");
        Champion jungleChampionByYounho = new Champion("그레이브즈", "정글");
        Champion midChampionByYounho = new Champion("티모", "미드");
        Champion adcChampionByYounho = new Champion("이즈리얼", "바텀");
        Champion supportChampionByYounho = new Champion("블리츠크랭크", "바텀");

        championListByYounho.add(topChampionByYounho);
        championListByYounho.add(jungleChampionByYounho);
        championListByYounho.add(midChampionByYounho);
        championListByYounho.add(adcChampionByYounho);
        championListByYounho.add(supportChampionByYounho);
    }

    //List<String>을 생성하고 값이 비어 있는지를 테스트 empty()
    @Test
    public void givenCollectionWhenEmptyCorrect() {
        // 종인
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, empty());
        emptyList.add("");
        assertThat(emptyList.get(0), isEmptyString());

        // 주호
        List<String> emptyListByJuho = new ArrayList<>();
        assertThat(emptyListByJuho, empty());

        //명수
        List<String> emptyListByMyungsoo = new ArrayList<>();
        assertThat(emptyListByMyungsoo, empty());

    }

    // 연호
    @Test
    public void givenCollectionWhenEmptyCorrectByYounho() {
        List<String> emptyListByYounho = new ArrayList<>();
        assertThat(emptyListByYounho, empty());
    }

    //notNullValue 활용한 테스트
    @Test
    public void notNullCheck() {
        // 종인
        String lck = "LCK";
        assertThat(lck, notNullValue());

        // 주호
        String NullTestByJuho = "Test";
        assertThat(NullTestByJuho, notNullValue());

        // 명수
        String nullTestByMyungsoo = "value";
        assertThat(nullTestByMyungsoo, notNullValue());

    }

    // 연호
    @Test
    public void notNullCheckByYounho() {
        String nullTestByYounho = "LOL";
        assertThat(nullTestByYounho, notNullValue());
    }

    //nullValue 활용한 테스트
    @Test
    public void givenStringWhenNullIsCorrect() {
        // 종인
        String lck = null;
        assertThat(lck, nullValue());
        lck = "Hi";
        assertThat(lck, notNullValue());

        // 주호
        String NullTestByJuho = null;
        assertThat(NullTestByJuho, nullValue());

        //명수
        String nullTestByMyungsoo = null;
        assertThat(nullTestByMyungsoo, nullValue());

    }

    // 연호
    @Test
    public void givenStringWhenNullIsCorrectByYounho() {
        String nullTestByYounho = null;
        assertThat(nullTestByYounho, nullValue());
    }


    //문자열 관련 테스트 anyOf, containsString, endWith
    @Test
    public void testForRelatedString() {
        // 종인
        String sampleString1 = "Player Focus";
        String sampleString2 = "Player point";
        String startString = "Player";
        String endString = "point";
        assertThat(sampleString1, anyOf(startsWith(startString), containsString(endString))); // OR
        assertThat(sampleString2, is(endsWith(endString)));
        assertThat(sampleString1, is(endsWith("Focus")));
        assertThat(sampleString2, is(containsString("yer p")));

        // 주호
        String Avengers1 = "Captain America";
        String Avengers2 = "Captain Iron Man";
        String startString2 = "Captain";
        String endString2 = "Man";
        assertThat(Avengers1, anyOf(startsWith(startString2), containsString(endString2)));
        assertThat(Avengers2, is(endsWith(endString2)));
        assertThat(Avengers1, is(endsWith("America")));

        //명수
        String player1 = "Thierry Henry";
        String player2 = "Killian Mbappe";
        String startPlayerString1 = "Thierry";
        String endPlayerString2 = "Mbappe";
        assertThat(player1, anyOf(startsWith(startPlayerString1), containsString(endPlayerString2)));
        assertThat(player2, anyOf(startsWith(startPlayerString1), containsString(endPlayerString2)));
        assertThat(player1, is(startsWith(startPlayerString1)));
        assertThat(player2, is(endsWith(endPlayerString2)));

    }

    //연호
    @Test
    public void testForRelatedStringByYounho() {
        String player3 = "Virgil Van Dijk";
        String player4 = "Mohamed Salah";
        String startPlayerString3 = "Virgil";
        String endPlayerString4 = "Salah";
        assertThat(player3, anyOf(startsWith(startPlayerString3), containsString(endPlayerString4)));
        assertThat(player4, anyOf(startsWith(startPlayerString3), containsString(endPlayerString4)));
        assertThat(player3, is(startsWith(startPlayerString3)));
        assertThat(player4, is(endsWith(endPlayerString4)));
    }

    //부동소수점 범위 closeTo 테스트
    @Test
    public void testForFloatingPoint() {
        // 종인
        assertThat(3.14, closeTo(3, 0.2));
        assertThat(2.96, closeTo(3.14, 0.2));

        // 주호
        assertThat(1.5, closeTo(2, 0.7));
        assertThat(-1.5, closeTo(-3, 2));

        //명수
        assertThat(7.18,closeTo(7,0.2));
        assertThat(1.22,closeTo(1,0.5));
    }

    // 연호
    @Test
    public void testForFloatingPointByYounho() {
        assertThat(10.4,closeTo(10.2,0.3));
        assertThat(-24.21,closeTo(-25,0.8));
    }

    //anything 테스트
    @Test
    public void shouldNotErrorGetReference() {
        // 종인
        assertThat(championList.get(2), anything()); // 값만 가져올 수 있으면 무슨 값이든 상관 없다.
        assertThat(championList.get(2), anyOf(notNullValue()));

        // 주호
        assertThat(championListByJuho.get(4), anything());

        // 명수
        assertThat(championListByMyungsoo.get(1),anything());
    }

    // 연호
    @Test
    public void shouldNotErrorGetReferenceByYounho() {
        assertThat(championList.get(4), anything());
        assertThat(championList.get(1), anyOf(notNullValue()));
    }

    //객체 크기 검증 테스트 hasSize
    @Test
    public void shouldChampionCountFive() {
        // 종인
        assertTrue(championList.size() == 5);
        assertThat(championList.size(), is(5));
        assertThat(championList, hasSize(5));

        // 주호
        assertFalse(championList.size() == 4);
        assertThat(championList.size(), not(4));
        assertThat(championList, hasSize(5));

        // 명수
        assertFalse(championListByMyungsoo.size()==3);
        assertThat(championListByMyungsoo.size(),not(3));
        assertThat(championListByMyungsoo,hasSize(5));

    }

    // 연호
    @Test
    public void shouldChampionCountFiveByYounho() {
        assertFalse(championListByYounho.size()==3);
        assertThat(championListByYounho.size(),not(3));
        assertThat(championListByYounho,hasSize(5));
    }

    //서폿 챔피언은 타릭이어야 한다라는 조건으로 테스트 코드 작성
    @Test
    public void shouldSupportChampionIsTaric() {
        // 종인
        Champion supportChamp = new Champion("타릭", "바텀");
        assertThat("타릭", is(supportChamp.getName()));
        assertThat("타릭", is(equalTo(supportChamp.getName())));
        assertThat("타릭", equalTo(supportChamp.getName()));

        // 주호
        Champion supportChampByJuho = new Champion("알리스타", "바텀");
        assertThat("알리스타", is(supportChampByJuho.getName()));
        assertThat("알리스타", is(equalTo(supportChampByJuho.getName())));
        assertThat("알리스타", equalTo(supportChampByJuho.getName()));

        // 명수
        Champion supportChampByMyungsoo = new Champion("럭스","바텀");
        assertThat("럭스",is(supportChampByMyungsoo.getName()));
        assertThat("럭스",is(equalTo(supportChampByMyungsoo.getName())));
        assertThat("럭스",equalTo(supportChampByMyungsoo.getName()));

    }

    // 연호
    @Test
    public void shouldSupportChampionIsBleachCrankByYounho() {
        // 명수
        Champion supportChampByYounho = new Champion("블리츠크랭크","바텀");
        assertThat("블리츠크랭크",is(supportChampByYounho.getName()));
        assertThat("블리츠크랭크",is(equalTo(supportChampByYounho.getName())));
        assertThat("블리츠크랭크",equalTo(supportChampByYounho.getName()));
    }

    //hasProperty 활용하여 속성이 포함되어 있는지 테스트
    @Test
    public void shouldHasPropertyPosition() {
        // 종인
        assertThat(championList.get(0), hasProperty("position"));
        assertThat(championList.get(0), hasProperty("position", equalTo("탑")));

        // 주호
        assertThat(championListByJuho.get(4), hasProperty("position"));
        assertThat(championListByJuho.get(4), hasProperty("position", equalTo("바텀")));

        // 명수
        assertThat(championListByMyungsoo.get(2), hasProperty("position"));
        assertThat(championListByMyungsoo.get(2), hasProperty("position", equalTo("미드")));
    }

    // 연호
    @Test
    public void shouldHasPropertyPositionByYounho() {
        assertThat(championListByYounho.get(1), hasProperty("position"));
        assertThat(championListByYounho.get(1), hasProperty("position", equalTo("정글")));
    }

    //hasToString 활용 테스트
    @Test
    public void shouldHaveSomeChampName() {
        // 종인
        List<String> champListNames = Arrays.asList("루시안", "애쉬", "렉사이", "갈리오", "모르가느", "블라디미르");
        assertThat(champListNames.get(0), hasToString("루시안"));

        // 주호
        List<String> champListNamesByJuho = Arrays.asList("징크스", "케이틀린", "시비르", "카이사", "이즈리얼");
        assertThat(champListNamesByJuho.get(0), hasToString("징크스"));

        // 명수
        List<String> champListNamesByMyungsoo = Arrays.asList("다이애나", "야스오", "갈리아", "나미", "갬플링크");
        assertThat(champListNamesByMyungsoo.get(3), hasToString("나미"));
    }

    // 연호
    @Test
    public void shouldHaveSomeChampNameByYounho() {
        List<String> champListNamesByYounho = Arrays.asList("문도박사", "그레이브즈", "티모", "블리츠크랭크", "케이틀린");
        assertThat(champListNamesByYounho.get(0), hasToString("문도박사"));
    }

    //property와 value가 같은지 테스트
    @Test
    public void shouldHaveSamePropertyAndValue() {
        // 종인
        List<String> championNames1 = Arrays.asList("루시안", "애쉬", "렉사이", "갈리오", "모르가나", "블라디미르");
        List<String> championNames2 = Arrays.asList("루시안", "애쉬");
        assertThat(championNames1, samePropertyValuesAs(championNames2));
//        assertThat(championNames1, samePropertyValuesAs(championList));

        //주호
        List<String> championNames1ByJuho = Arrays.asList("징크스", "케이틀린", "시비르", "카이사", "이즈리얼");
        List<String> championNames2ByJuho = Arrays.asList("징크스");
        assertThat(championNames1ByJuho, samePropertyValuesAs(championNames2ByJuho));

        //명수
        List<String> championNames1ByMyungsoo = Arrays.asList("다이애나", "야스오", "갈리아", "나미", "갬플링크");
        List<String> championNames2ByMyungsoo = Arrays.asList("갬플링크");
        assertThat(championNames1ByMyungsoo, samePropertyValuesAs(championNames2ByMyungsoo));
    }

    // 연호
    @Test
    public void shouldHaveSamePropertyAndValueByYounho() {
        List<String> championNames1ByYounho = Arrays.asList("문도박사", "그레이브즈", "티모", "블리츠크랭크", "케이틀린");
        List<String> championNames2ByYounho = Arrays.asList("블리츠크랭크");
        assertThat(championNames1ByYounho, samePropertyValuesAs(championNames2ByYounho));
    }

    //탑 챔피언은 다리우스여야 한다라는 조건으로 테스트 코드 작성, stream 활용예
    @Test
    public void shouldTopChampionIsDarius() {

        // 종인
        Optional<Champion> filterdChampion = championList.stream()
                .filter(c -> c.getPosition().equals("탑"))
                .findFirst();
        System.out.println("Result: " + filterdChampion);
        String champName = filterdChampion.get().getName();
        assertTrue(champName.equals("다리우스"));
        assertThat("다리우스", is(champName));


        // 주호
        Optional<Champion> filterdChampionByJuho = championListByJuho.stream()
                .filter(c -> c.getPosition().equals("미드"))
                .findFirst();
        System.out.println("Result: " + filterdChampionByJuho);
        String champNameByJuho = filterdChampionByJuho.get().getName();
        assertTrue(champNameByJuho.equals("조이"));
        assertThat("조이", is(champNameByJuho));

        // 종인
        Optional<Champion> filterdChampionByMyungsoo = championListByMyungsoo.stream()
                .filter(c -> c.getPosition().equals("탑"))
                .findFirst();
        System.out.println("Result: " + filterdChampion);
        String champNameByMyungsoo = filterdChampionByMyungsoo.get().getName();
        assertTrue(champNameByMyungsoo.equals("가렌"));
        assertThat("가렌", is(champNameByMyungsoo));

    }

    // 연호
    @Test
    public void shoudTopChampionIsMundoByYounho() {
        Optional<Champion> filterdChampionByYounho = championListByYounho.stream()
                .filter(c -> c.getPosition().equals("탑"))
                .findFirst();
        System.out.println("Result: " + filterdChampionByYounho);
        String champNameByYounho = filterdChampionByYounho.get().getName();
        assertTrue(champNameByYounho.equals("문도박사"));
        assertThat("문도박사", is(champNameByYounho));
    }

}