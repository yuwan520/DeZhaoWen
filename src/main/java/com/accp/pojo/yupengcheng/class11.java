package com.accp.pojo.yupengcheng;

public class class11 {
    private Integer classno;

    private String classname;

    private Integer weight;
    
    private Integer manHour;
    

    public Integer getManHour() {
		return manHour;
	}

	public void setManHour(Integer manHour) {
		this.manHour = manHour;
	}

	public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}