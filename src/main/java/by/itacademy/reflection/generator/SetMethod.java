package by.itacademy.reflection.generator;

import by.itacademy.reflection.generator.random.RandomBoolean;
import by.itacademy.reflection.generator.random.RandomDate;
import by.itacademy.reflection.generator.random.RandomInt;
import by.itacademy.reflection.generator.random.RandomString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class SetMethod<T> {
    private T object;

    public SetMethod(T object) {
        this.object = object;
    }

    public void execute(Field field) throws CustomInstantiationException {
        String methodName = getSetMethodName(field);
        Method method = getMethod(methodName, field.getType());

        try {
            if (field.getType().getSimpleName().equals("int"))
                method.invoke(object, new RandomInt().execute());
            else if (field.getType().getSimpleName().equals("String"))
                method.invoke(object, new RandomString().execute());
            else if (field.getType().getSimpleName().equals("Date"))
                method.invoke(object, new Date(new RandomDate().execute()));
            else if (field.getType().getSimpleName().equals("boolean"))
                method.invoke(object, new RandomBoolean().execute());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new CustomInstantiationException(e);
        }
    }

    private String getSetMethodName(Field field) {
        String name = field.getName();
        char[] chars = name.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return String.join("", "set", new String(chars));
    }

    private Method getMethod(String methodName, Class<?> paramType) throws CustomInstantiationException {
        try {
            return object.getClass().getMethod(methodName, paramType);
        } catch (NoSuchMethodException e) {
            throw new CustomInstantiationException(e);
        }
    }
}