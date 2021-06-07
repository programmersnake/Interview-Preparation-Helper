package stream_api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumFromTheListTest {

    @Test
    public void test() {
        SumFromTheList sumFromTheList = new SumFromTheList();
        int sum = sumFromTheList.sumElementsFromTheList( Arrays.asList( "AAA", "2", "r", "8" ) );
        Assertions.assertEquals( sum, 10 );
    }

}
