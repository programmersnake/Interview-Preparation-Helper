package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void searchShould() {
        BinarySearch search = new BinarySearch();
        Assertions.assertAll(
                () ->  Assertions.assertEquals( 0, search.search( 1,  new int[] {1, 2, 3, 4} ) ),
                () ->  Assertions.assertEquals( 1, search.search( 2,  new int[] {1, 2, 3, 4} ) ),
                () ->  Assertions.assertEquals( -1, search.search(-1, new int[] {1, 2, 3, 4} ) )
        );
    }

}