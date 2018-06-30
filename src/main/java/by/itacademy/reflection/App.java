package by.itacademy.reflection;

import by.itacademy.reflection.generator.BeanFactory;
import by.itacademy.reflection.generator.CustomInstantiationException;
import by.itacademy.reflection.generator.FieldGenerator;


public class App {

    public static void main(String[] args) throws CustomInstantiationException {
        System.setProperty("java.util.logging.config.file", "log.properties");
        BeanFactory<Student> studentBeanFactory = new BeanFactory<>(Student.class);
        Student student = studentBeanFactory.createObject();
        FieldGenerator<Student> fieldGenerator = new FieldGenerator<>(student);
        fieldGenerator.execute();
        System.out.println(student);

        Compression compression = new Compression();
        String example = "HellloWoooorld";
        String temp = compression.compressionIn(example);
        System.out.println(temp);
        String finish = compression.compressionOut(temp);
        System.out.println(finish);


    }
}