package com.zipcodewilmington.looplabs;

import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Stream.of(this.array).filter(i->countOccurrences(i)<maxNumberOfDuplications).toArray(Integer[]::new);

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Stream.of(this.array).filter(i->countOccurrences(i)!=exactNumberOfDuplications).toArray(Integer[]::new);



    }

    public Integer countOccurrences(Integer element){
        Integer value = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i].equals(element)){
                value ++;
            }
        }
        return value;

    }

}
