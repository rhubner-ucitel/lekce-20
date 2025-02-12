package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleIteratorTest {

    private static final String[] TEST_DATA = new String[] { "test1", "test2", "test3", "test4", "test5", "test6" };
    private static final List<String> LIST_TEST_DATA = List.of(TEST_DATA);

    @Test
    public void testArrayIterator() {
        testIterator(SimpleIterator.arrayInterator(TEST_DATA));
    }

    @Test
    public void testListIterator() {
        testIterator(SimpleIterator.listInterator(LIST_TEST_DATA));
    }

    public void testIterator(SimpleIterator<String> iterator) {
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test1");
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test2");
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test3");
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test4");
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test5");
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("test6");
        assertThat(iterator.hasNext()).isFalse();

    }



}
