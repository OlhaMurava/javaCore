package labnum3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepartmentDemo {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department("Department of Mathematics", 10, 3, "Faculty of Mathematics", "Math Building", DepartmentType.SCIENCE));
        departments.add(new Department("Department of Physics", 8, 4, "Faculty of Physics", "Physics Building", DepartmentType.SCIENCE));
        departments.add(new Department("Department of Chemistry", 12, 5, "Faculty of Chemistry", "Chemistry Building", DepartmentType.SCIENCE));
        departments.add(new Department("Department of History", 7, 2, "Faculty of Humanities", "History Building", DepartmentType.ARTS));
        departments.add(new Department("Department of Business", 6, 1, "Faculty of Business", "Business Building", DepartmentType.BUSINESS));

        // Вивід інформації про всі кафедри
        for (Department dept : departments) {
            System.out.println(dept);
        }

        // Сортування кафедр за назвою
        Collections.sort(departments);
        System.out.println("After Sorting by name:");
        departments.forEach(System.out::println);
    }
}
