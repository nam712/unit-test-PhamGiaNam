/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */

package com.mycompany.student.analyzer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> scores = Arrays.asList(9.0, 10.0, 7.5, 8.5, -1.0, 11.0, null);

        StudentAnalyzer analyzer = new StudentAnalyzer();

        int excellentCount = analyzer.countExcellentStudents(scores);
        System.out.println("Số học sinh giỏi: " + excellentCount);

        double average = analyzer.calculateValidAverage(scores);
        System.out.println("Điểm trung bình hợp lệ: " + average);
    }
}
