package Generics;

import jdk.internal.org.objectweb.asm.util.Printer;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class GenericTask {

    public<T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

}

