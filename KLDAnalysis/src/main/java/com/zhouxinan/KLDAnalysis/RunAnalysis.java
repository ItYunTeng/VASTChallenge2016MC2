package com.zhouxinan.KLDAnalysis;

import java.io.IOException;
import java.sql.SQLException;

public class RunAnalysis {
	public static void main(String[] args) throws SQLException, IOException {
		Analysis analysis = new Analysis();
//		analysis.buildDailyDataTable();
		analysis.calculateKLDPerPerson(true, true);
		analysis.calculateKLDPerPerson(false, true);
		analysis.calculateKLDOfSortedHistogramPerPerson(true);
//		analysis.calculateAverageKLDPerDayPerPerson(true);
//		analysis.calculateAverageKLDPerDayPerPerson(false);
//		analysis.calculateAverageKLDOfSortedHistogramPerDayPerPerson();
		analysis.calculateKLDPerDepartment(true, true);
		analysis.calculateKLDPerDepartment(false, true);
		analysis.calculateKLDOfSortedHistogramPerDepartment(true);
//		analysis.calculateAverageKLDPerDepartment(true);
//		analysis.calculateAverageKLDPerDepartment(false);
//		analysis.calculateAverageKLDOfSortedHistogramPerDepartment();
	}
}
