package com.javalec.project.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.project.dao.Write_dao;

public class LwriteCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String wContent = request.getParameter("wContent");
		Date wStart = request.getParameter("wStart");
		Date wEnd = request.getParameter("wEnd");
		String wImport = request.getParameter("wImport");
		String wFinish = request.getParameter("wFinish");

	
		Write_dao dao = new Write_dao();
		dao.lwrite(wContent, wStart, wEnd ,wImport ,wFinish);

	}

}