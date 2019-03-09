package acme.study_guide.chapter08.understanding_files_and_directories.creating_a_file_object;

public class Example {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(java.io.File.separator);
    }
}
