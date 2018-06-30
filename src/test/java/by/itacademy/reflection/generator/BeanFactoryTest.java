package by.itacademy.reflection.generator;

import by.itacademy.reflection.Student;
import org.junit.Assert;
import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void studentInstantiationValid() throws CustomInstantiationException {
        BeanFactory<Student> studentBeanFactory = new BeanFactory<>(Student.class);
        Student student = studentBeanFactory.createObject();
        Assert.assertNotNull(student);
    }
}