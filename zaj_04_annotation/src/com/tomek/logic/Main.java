package com.tomek.logic;

import com.tomek.annotations.Author;
import com.tomek.annotations.Important;
import com.tomek.annotations.InPolish;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<User> userClass = User.class;
        if(userClass.isAnnotationPresent(Author.class)) {
            Author authorAnnotation = userClass.getAnnotation(Author.class);
            System.out.println("Author of class " + userClass.getSimpleName() +
            " is " + authorAnnotation.author());
        }

        for(Method method : userClass.getDeclaredMethods()) {
            if(method.isAnnotationPresent(InPolish.class)) {
                InPolish inPolishAnnotation = method.getAnnotation(InPolish.class);
                System.out.println("Method " + method.getName() +
                        " is translated into polish as " + inPolishAnnotation.InPolish());
            }
        }

        // TODO to nie dziala
        for(Field field : userClass.getDeclaredFields()) {
            if(field.isAnnotationPresent(Important.class)) {
                System.out.println("Field " + field.getName() + " is not important");
            }
        }

    }
}
