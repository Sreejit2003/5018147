public class MVCPatternTest {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("Sreejit Sarkar", "98567", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Update view
        controller.updateView();

        // Update model data
        controller.setStudentName("Abhishek Ghosh");
        controller.setStudentGrade("B");

        // Update view again
        controller.updateView();
    }
}
