/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student.analyzer;

import java.util.List;

/**
 *
 * @author PC
 */
public class StudentAnalyzer {

    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;
        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0.0;
        double total = 0;
        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                total += score;
                count++;
            }
        }
        return count == 0 ? 0.0 : total / count;
    }
}