package com.pramod.java.designpattern.builder;

import java.util.EnumSet;
import java.util.Set;

public abstract class AbstractClass {

    public enum Topping {HUM,MUSHROOM,ONION,PEPPER,SAUSAGE}
    final Set<Topping> toppings ;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);


        public T Topping(Topping topping) {
            toppings.add(topping);
            return self();

        }

        protected abstract T self();
        public T build() {
            return (T) this;
        }
    }
    AbstractClass(Builder<?> builder){
        toppings = builder.toppings.clone();
    }


}
