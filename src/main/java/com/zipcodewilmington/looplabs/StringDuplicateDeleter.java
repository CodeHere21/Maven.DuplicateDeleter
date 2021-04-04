package com.zipcodewilmington.looplabs;

import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Stream.of(this.array).filter(i -> countOccurrences(i) < maxNumberOfDuplications).toArray(String[]::new);

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Stream.of(this.array).filter(i -> countOccurrences(i) != exactNumberOfDuplications).toArray(String[]::new);

    }

    public Integer countOccurrences(String word) {
        Integer count = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(word)) {
                count++;
            }
        }
        return count;

    }
}