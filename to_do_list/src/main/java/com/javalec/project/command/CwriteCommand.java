package com.javalec.project.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.project.dao.Write_dao;

public class CwriteCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String cName = request.getParameter("cName");
	
		Write_dao dao = new Write_dao();
		dao.cwrite(cName);

	}

}