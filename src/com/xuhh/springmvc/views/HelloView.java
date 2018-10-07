package com.xuhh.springmvc.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 23:20 2018/10/6
 * @Modified By:
 */
@Component
public class HelloView implements View{

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> map, HttpServletRequest Request, HttpServletResponse Response) throws Exception {
			Response.getWriter().print("hello view, rime:"+new Date());
	}
}
