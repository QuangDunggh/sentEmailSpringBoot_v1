package com.bpoTECH.response.exportCsvResponse;

import com.bpoTECH.response.CommonResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportCsvResponse extends CommonResponse {

	private ExportCsvResultResponse result;

	public ExportCsvResponse createSuccess(String code, String message) {
		
		ExportCsvResponse response = new ExportCsvResponse();
		
		ExportCsvResultResponse result = new ExportCsvResultResponse();
		
		return response;

	}

}
