package com.example.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	private int eid;
	private String ename;

	@Autowired
	private DepartmentBean deptBean;
	public static Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

	@Autowired
	EmployeeBean(DepartmentBean deptBean) {
		logger.trace("Auto wired by using @Autowire  annotation on construction");
		this.deptBean = deptBean;
	}

	public EmployeeBean() {
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	public void showEmployeeDetails() {
		logger.debug("Employee Id: " + eid);
		logger.debug("Employee Name: " + ename);
		deptBean.setDeptName("Information Technology");
		logger.debug("Department : {}", deptBean.getDeptName());
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", deptBean=" + deptBean + "]";
	}
}