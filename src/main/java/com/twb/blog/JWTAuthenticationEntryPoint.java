package com.twb.blog;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twb.blog.utils.JwtTokenUtils;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint {
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		String reason = "统一处理，原因：";
		if (JwtTokenUtils.ErrorMsg != "") {
			reason += JwtTokenUtils.ErrorMsg;
		} else {
			reason += authException.getMessage();
		}
		response.getWriter().write(new ObjectMapper().writeValueAsString(reason));
	}
}
