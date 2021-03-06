package com.zhouxinan.KLDAnalysis;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONToMySQL {
	public void importTable() throws SQLException, FileNotFoundException, IOException, ParseException {
		Dao dao = Dao.getInstance();
		JSONParser parser = new JSONParser();
		Object object = parser.parse(new FileReader("json/proxOut-MC2.json"));
		JSONArray array = (JSONArray) object;
		for (Object o : array) {
			JSONObject record = (JSONObject) o;
			JSONObject message = (JSONObject) record.get("message");
			String proxCard = (String) message.get("proxCard");
			String zone = (String) message.get("zone");
			String datetime = (String) message.get("datetime");
			Integer floor = Integer.parseInt((String) message.get("floor"));
			Double offset = (Double) record.get("offset");
//			dao.insertRowToTable(proxCard.substring(0, proxCard.length() - 3), zone, datetime, floor, 1, offset);
			dao.insertRowToTable(proxCard, zone, datetime, floor, 1, offset);
		}
	}
}
