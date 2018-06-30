package by.itacademy.reflection.generator;

import by.itacademy.reflection.Student;
import org.junit.Assert;
import org.junit.Test;

public class FieldGeneratorTest {
    @Test
    public void studentFieldsGenerationValid() throws CustomInstantiationException {
        BeanFactory<Student> studentBeanFactory = new BeanFactory<>(Student.class);
        Student student = studentBeanFactory.createObject();
        FieldGenerator<Student> fieldGenerator = new FieldGenerator<>(student);
        fieldGenerator.execute();

        Assert.assertNotNull(student);
        Assert.assertNotNull(student.getName());
        Assert.assertTrue(student.getNumberOfLessons()>0);
        Assert.assertNotNull(student.getBirth());
    }
}
