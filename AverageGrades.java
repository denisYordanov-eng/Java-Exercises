package Exercises;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> allStudents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine()
                    .split("\\s+");
            String name = input[0];
            List<Double> grades = new ArrayList<>();
            for (int j = 1; j < input.length; j++) {
                grades.add(Double.parseDouble(input[j]));
            }

            Student student = new Student(name, grades);

            allStudents.add(student);
        }

        List<Student> sortedGrades = allStudents
                .stream()
                .filter(s -> s.getAverageGrade() >= 5.00)
                .sorted(
                        Comparator.comparing(Student::getName)
                                .thenComparing(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                )
                .toList();
               // .collect(Collectors.toList());


        for (Student student : sortedGrades) {
            System.out.printf("%s -> %.2f%n", student.getName(), student.getAverageGrade());
        }

    }

    static class Student {
        private final String name;
        private final List<Double> grades;

        public Student(String name, List<Double> grades) {
            this.name = name;
            this.grades = new ArrayList<>(grades);
        }

        public String getName() {
            return name;
        }

        public List<Double> getGrades() {
            return Collections.unmodifiableList(grades);
        }

        public Double getAverageGrade() {
            return grades.stream().mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.00);
        }
    }
}
