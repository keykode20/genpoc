package co.uk.emilyo.framework.util;

import java.util.function.Supplier;

public class NullSafe{
    public static <T> T object(T t, Supplier<T> s){
        return t != null ? t : s.get();
    }
}
