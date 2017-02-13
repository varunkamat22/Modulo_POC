package test;

import java.sql.Connection;
import java.sql.SQLException;

import dbconnector.DBConnectionManager;
import dbconnector.DBService;
import parser.DataObject;
import parser.JSONObjectAccessor;
import parser.ObjectFileParser;

public class DBTester {

	public static void main(String[] args) throws Exception {
		JSONObjectAccessor loginAccessor = ObjectFileParser.getJSONObjectAccessor("/parser/Login.obj");
		Connection _connection = DBConnectionManager.getConnection();
		//new DBService(_connection).createTable(loginAccessor);
		DataObject loginObject = loginAccessor.getDataObject();
		loginObject.setAttributeValue("userName", "jhon");
		loginObject.setAttributeValue("password", "jhon123");
		new DBService(_connection).insertIntoDB(loginObject);
		_connection.close();
	}

}
