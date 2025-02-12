package cz.robotdreams.java.lekce20;

import java.util.List;

public interface SimpleIterator<E> {

    public boolean hasNext();
    E next();


    static <T> SimpleIterator<T> arrayInterator(T[] array) {
        return new SimpleIterator() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < array.length;
            }

            @Override
            public Object next() {
                Object o = array[i];
                i++;
                return o;
            }
        };
    }

    static <T> SimpleIterator<T> listInterator(List<T> list) {

        return new SimpleIterator() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < list.size();
            }

            @Override
            public Object next() {
                Object o = list.get(i);
                i++;
                return o;
            }
        };
    }


}
