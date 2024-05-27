public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        // Добавляем учителей
        teacherController.addTeacher(1, "John Doe", "Mathematics");
        teacherController.addTeacher(2, "Jane Smith", "Physics");
        teacherController.addTeacher(3, "Emily Johnson", "Chemistry");

        // Отображаем всех учителей
        System.out.println("All teachers:");
        teacherController.displayAllTeachers();

        // Обновляем информацию об учителе
        teacherController.updateTeacher(2, "Jane Smith", "Biology");

        // Отображаем информацию об одном учителе
        System.out.println("\nDetails of teacher with ID 2:");
        teacherController.displayTeacherById(2);

        // Отображаем всех учителей после обновления
        System.out.println("\nAll teachers after update:");
        teacherController.displayAllTeachers();
    }
}
