package com.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */


public class HelloController implements Controller{
	 private static final Log logger = LogFactory
	            .getLog(HelloController.class);
	 
	 /**
	  * handleRequest��Controller�ӿڱ���ʵ�ֵķ�����
	  * �÷����Ĳ����Ƕ�Ӧ�����HttpServletRequest��HttpServletResponse��
	  * �÷������뷵��һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
	  * */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 logger.info("handleRequest ������");
		 // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
		 ModelAndView mv = new ModelAndView();
		 // ���ģ������ �����������POJO����  
	     mv.addObject("message", "Hello World!");  
	     // �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
	     mv.setViewName("/WEB-INF/welcome.jsp"); 
		// ����ModelAndView����
		return mv;
	}

}

