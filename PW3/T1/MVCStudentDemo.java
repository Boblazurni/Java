package PW3.T1;

public class MVCStudentDemo {
    public static void main(String[] args) {
        // Получаем данные студента из базы данных
        Student model = retrieveStudentFromDatabase();
        
        // Создаем представление
        StudentView view = new StudentView();
        
        // Создаем контроллер
        StudentController controller = new StudentController(model, view);
        
        // Обновляем представление
        controller.updateView();
        
        // Обновляем модель
        controller.setStudentName("John");
        System.out.println("\nAfter updating, Student Details are as follows:");
        
        // Снова обновляем представление
        controller.updateView();
    }
    
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}