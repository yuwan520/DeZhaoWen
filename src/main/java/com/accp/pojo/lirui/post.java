package com.accp.pojo.lirui;

public class post {
    private String postid;

    private String postname;

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid == null ? null : postid.trim();
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

	public post(String postid, String postname) {
		super();
		this.postid = postid;
		this.postname = postname;
	}

	public post() {
		super();
	}

	@Override
	public String toString() {
		return "post [postid=" + postid + ", postname=" + postname + "]";
	}
}