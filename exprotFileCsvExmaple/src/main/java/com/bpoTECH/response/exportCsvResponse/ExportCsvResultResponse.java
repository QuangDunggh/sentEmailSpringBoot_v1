package com.bpoTECH.response.exportCsvResponse;

import java.util.List;

import com.bpoTECH.response.CommonMessageResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportCsvResultResponse {
	
	private List<CommonMessageResponse> messages;

}
