package by.itacademy.reflection.generator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BeanFactory<T> {
    private static final Logger LOGGER = Logger.getLogger(BeanFactory.class.getName());
    private Class<T> clazz;

    public BeanFactory(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T createObject() throws CustomInstantiationException {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
            throw new CustomInstantiationException(e);
        }
    }
}