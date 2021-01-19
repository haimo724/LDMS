package cn.cug.laboratory.model.persistent;

import lombok.Data;

import java.util.Date;

@Data
public class Project {
    private String id;//项目编号

    private String labId;//实验编号

    private String teaId;//教师编号

    private String name;//项目名称

    private Date startTime;//项目开始时间

    private Date endTime;//项目结束时间

    private Integer capacity;

    private Integer leftCapacity;

    private Integer state=0;//项目状态

    private Float credit;

    private Date submitTime;//项目提交时间

    private Date passTime;//项目通过时间

    private String devices;//设备名称

    private String files;//项目文件名称

    private String description;//项目描述

	public String getId() {
		return null;
	}

	public String getDevices() {
		return null;
	}

	public void setId(String newId) {
	}

	public void setTeaId(String teacherNameById) {
	}

	public void setDevices(String devices2) {
	}

	public void setSubmitTime(java.sql.Date date) {
	}

	public void setEndTime(java.sql.Date date) {
	}

	public void setFiles(String name2) {
	}

	public String getLabId() {
		return null;
	}

	public void setLabId(String labIdByName) {
	}

	public Object getEndTime() {
		return null;
	}

	public Object getCapacity() {
		return null;
	}

	public void setLeftCapacity(Object capacity2) {
	}

	public Object getName() {
		return null;
	}

	public void setTeaId(Object id2) {
	}

	public Date getStartTime() {
		return null;
	}

}