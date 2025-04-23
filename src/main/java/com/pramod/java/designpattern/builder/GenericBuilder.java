package com.pramod.java.designpattern.builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {
//    private final T instance; // Holds the object being built
//
//    private GenericBuilder(Supplier<T> supplier) {
//        this.instance = supplier.get(); // Create a single instance
//    }
//
//    public static <T> GenericBuilder<T> of(Supplier<T> supplier) {
//        return new GenericBuilder<>(supplier);
//    }
//
//    public <P> GenericBuilder<T> with(BiConsumer<T, P> consumer, P value) {
//        consumer.accept(instance, value); // Apply the consumer to modify the instance
//        return this; // Return the same builder for chaining
//    }
//
//    public T get() {
//        return instance; // Return the fully built object
//    }


    private final Supplier <T> supplier;

    GenericBuilder(Supplier <T> supplier){
        this.supplier = supplier;
    }


    public static  <T> GenericBuilder<T> of(Supplier<T> supplier){
        return new GenericBuilder<>(supplier);

    }

    public <P> GenericBuilder<T> with(BiConsumer<T,P> builder, P value){
        return new GenericBuilder(()->{
            T object = supplier.get();
            builder.accept(object,value);
            return object;
        });
    }

    public T get() {
        return supplier.get();
    }

}
