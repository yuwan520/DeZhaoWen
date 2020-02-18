package com.accp.pojo;

public class shop {
    private String shopid;

    private String shopname;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

	@Override
	public String toString() {
		return "shop [shopid=" + shopid + ", shopname=" + shopname + "]";
	}

	public shop(String shopid, String shopname) {
		super();
		this.shopid = shopid;
		this.shopname = shopname;
	}

	public shop() {
		super();
	}
}