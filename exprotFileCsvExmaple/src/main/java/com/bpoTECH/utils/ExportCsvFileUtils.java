package com.bpoTECH.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

@Component
public class ExportCsvFileUtils<T> {

	public void exportCsvUtis(HttpServletResponse response, List<T> list, List<String> csvHeader,
			List<String> nameMapping) throws IOException {

		response.setContentType("text/csv");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=users_" + currentDateTime + ".csv";
		response.setHeader(headerKey, headerValue);

		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		String[] csvHeader1 = { "User ID", "Name", "Email", "ClassST", "Phone" };
		String[] nameMapping1 = { "id", "classSt", "email", "name", "phone" };

		csvWriter.writeHeader(csvHeader1);

		for (T t : list) {
			
			System.out.println("item: " + t);
			
			csvWriter.write(t, nameMapping1);
		}

		csvWriter.close();

	}

}
