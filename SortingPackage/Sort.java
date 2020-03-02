package fmi.informatics.SortingPackage;
import fmi.informatics.extending.Student;
import fmi.informatics.functional.MySimpleInterface2;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort implements Interface {
    @Override
    public String selectStrings(String Name , String Fam, int Age) {
        String concatenate = (Name + " " + Fam + " at age " + Age);
        return concatenate;
    }
    public static void Descending() {
        List<Student> StudentsSortArr = Arrays.asList
                (
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make()
                );
        StudentsSortArr.sort((b, a) -> a.getSpeciality().compareTo(b.getSpeciality()));
        StudentsSortArr.forEach((n) -> System.out.println(n));
    }
    public static void testFunction(MySimpleInterface2 msi2) {
        String conSomething = msi2.concatenate("Hello", "there");
        System.out.print(conSomething);
    }
    public static void Ascending() {
        List<Student> StudentsSortArr = Arrays.asList
                (
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make()
                );
        StudentsSortArr.sort(Comparator.comparing(Student::getSpeciality));
        StudentsSortArr.forEach((n) -> System.out.println(n));
        }
}
