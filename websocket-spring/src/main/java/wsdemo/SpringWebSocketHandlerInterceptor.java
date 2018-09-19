package wsdemo;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;
/**
 * 
 * 
 * @author shentt
 * @date 2018年4月10日
 * @className SpringWebSocketHandlerInterceptor.java
 * @param 
 * @Description 页面连接websocket服务的拦截器
 */
public class SpringWebSocketHandlerInterceptor extends HttpSessionHandshakeInterceptor{
	 @Override
	    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	            Map<String, Object> attributes) throws Exception {
	        // TODO Auto-generated method stub
	        System.out.println("Before Handshake");
	        if (request instanceof ServletServerHttpRequest) {
	            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
	            HttpSession session = servletRequest.getServletRequest().getSession(false);
	            if (session != null) {
	                //使用userName区分WebSocketHandler，以便定向发送消息
	                String userName =((ServletServerHttpRequest) request).getServletRequest().getParameter("username");
	                if (userName==null) {
	                	return false;
	                }
	                attributes.put("WEBSOCKET_USERNAME",userName);
	            }
	        }
	        return super.beforeHandshake(request, response, wsHandler, attributes);
	        
	    }
	    
	    @Override
	    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	            Exception ex) {
	        // TODO Auto-generated method stub
	        super.afterHandshake(request, response, wsHandler, ex);
	    }
}
