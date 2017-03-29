package com.qingke.myTag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport {
	private String msg;
	public void doTag() throws JspException,IOException{
		if(msg!=null){
			JspWriter out = getJspContext().getOut();
			out.println(msg);
		}else{
			StringWriter sw = new StringWriter();
			if(getJspBody()!=null)
				getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
