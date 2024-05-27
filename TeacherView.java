import java.util.List;

public class TeacherView {
    public void displayTeacherDetails(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void displayAllTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
