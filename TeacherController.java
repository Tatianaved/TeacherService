public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void addTeacher(int id, String name, String subject) {
        Teacher teacher = new Teacher(id, name, subject);
        teacherService.addTeacher(teacher);
    }

    public void updateTeacher(int id, String name, String subject) {
        teacherService.updateTeacher(id, name, subject);
    }

    public void displayTeacherById(int id) {
        Teacher teacher = teacherService.getTeacherById(id);
        teacherView.displayTeacherDetails(teacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayAllTeachers(teachers);
    }
}
