package com.accp.pojo.yupengcheng;

import java.util.List;

public class car {
    private String numbercar;

    private String brands;

    private String typecar;

    private Integer mileage;

    private Integer teamno;
    
    private List<team> li;
    
    
    
   
	public List<team> getLi() {
		return li;
	}

	public void setLi(List<team> li) {
		this.li = li;
	}

	public String getNumbercar() {
        return numbercar;
    }

    public void setNumbercar(String numbercar) {
        this.numbercar = numbercar == null ? null : numbercar.trim();
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands == null ? null : brands.trim();
    }

    public String getTypecar() {
        return typecar;
    }

    public void setTypecar(String typecar) {
        this.typecar = typecar == null ? null : typecar.trim();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getTeamno() {
        return teamno;
    }

    public void setTeamno(Integer teamno) {
        this.teamno = teamno;
    }

	@Override
	public String toString() {
		return "car [numbercar=" + numbercar + ", brands=" + brands + ", typecar=" + typecar + ", mileage=" + mileage
				+ ", teamno=" + teamno + ", li=" + li + "]";
	}

	public car(String numbercar, String brands, String typecar, Integer mileage, Integer teamno, List<team> li) {
		super();
		this.numbercar = numbercar;
		this.brands = brands;
		this.typecar = typecar;
		this.mileage = mileage;
		this.teamno = teamno;
		this.li = li;
	}

	public car() {
		super();
	}
    
}