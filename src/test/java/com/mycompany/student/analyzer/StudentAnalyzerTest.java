package com.mycompany.student.analyzer;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> input = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        int result = analyzer.countExcellentStudents(input);
        System.out.println("Test: testCountExcellentStudents_NormalCase");
        System.out.println("Input: " + input);
        System.out.println("Output (Excellent Students): " + result);
        assertEquals(2, result);
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> input = Collections.emptyList();
        int result = analyzer.countExcellentStudents(input);
        System.out.println("Test: testCountExcellentStudents_EmptyList");
        System.out.println("Input: " + input);
        System.out.println("Output (Excellent Students): " + result);
        assertEquals(0, result);
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> input = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        double result = analyzer.calculateValidAverage(input);
        System.out.println("Test: testCalculateValidAverage_NormalCase");
        System.out.println("Input: " + input);
        System.out.printf("Output (Valid Average): %.2f%n", result);
        assertEquals(8.17, result, 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> input = Collections.emptyList();
        double result = analyzer.calculateValidAverage(input);
        System.out.println("Test: testCalculateValidAverage_EmptyList");
        System.out.println("Input: " + input);
        System.out.printf("Output (Valid Average): %.2f%n", result);
        assertEquals(0.0, result);
    }
}
