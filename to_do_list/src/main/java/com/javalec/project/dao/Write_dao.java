package com.javalec.project.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Write_dao {

	DataSource dataSource;
	
	public Write_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/to_do_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cwrite(String cName) {
		//TODO Auto-generated method stub
	
			Connection connection = null;
			PreparedStatement preparedStatement = null;
	
			try {
				connection = dataSource.getConnection();
				String query = "insert into td_category (cName) values(?)";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, cName);

				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {   //finally는 이상이 없었을때나 있었을때나  메모리 정리를 해주는 것 
				
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}					//write
	
	public void lwrite(String wContent, Date wStart, Date wEnd , String wImport ,String wFinish) {
		//TODO Auto-generated method stub
	
			Connection connection = null;
			PreparedStatement preparedStatement = null;
	
			try {
				connection = dataSource.getConnection();
				String query = "insert into td_write (wContent, wStart, wEnd, wImport, wFinish) values(?,?,?,?,?)";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, wContent);
				preparedStatement.setDate(2, wStart);
				preparedStatement.setDate(3, wEnd);
				preparedStatement.setString(4, wImport);
				preparedStatement.setString(5, wFinish);

				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {   //finally는 이상이 없었을때나 있었을때나  메모리 정리를 해주는 것 
				
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

//	public S2Dto contentView(String ssNum) {
//			S2Dto dto = null ;
//			Connection connection = null;
//			PreparedStatement preparedStatement = null;
//			ResultSet resultSet = null;
//			
//			try {
//				connection = dataSource.getConnection();
//				String query = "select * from addressbook where sNum =? ";
//				preparedStatement = connection.prepareStatement(query);
//				preparedStatement.setInt(1, Integer.parseInt(ssNum));
//				resultSet = preparedStatement.executeQuery();
//				
//				if(resultSet.next()) {
//					int sNum =resultSet.getInt("sNum");
//					String sName = resultSet.getString("sName");
//					String sPhone = resultSet.getString("sPhone");
//					String sAddress = resultSet.getString("sAddress");
//					String sEmail = resultSet.getString("sEmail");
//					String sRelation = resultSet.getString("sRelation");
//					
//					dto = new S2Dto(sNum, sName, sPhone, sAddress, sEmail,sRelation);
//					
//				}
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}finally {   //finally는 이상이 없었을때나 있었을때나  메모리 정리를 해주는 것 
//				
//			try {
//				if(resultSet != null) resultSet.close(); //데이터가 있으면 클로즈해라 
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//			return dto;
//			
//	}	//contentView



}