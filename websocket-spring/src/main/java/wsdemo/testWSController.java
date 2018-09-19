package wsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

@Controller
public class testWSController {
	@Autowired
	private SpringWebSocketHandler springWebSocketHandler;
	
	@ResponseBody
	@RequestMapping("/setMsg")
	public void setMsg(String username,String msg){
		TextMessage tMsg=new TextMessage(msg);
		springWebSocketHandler.sendMessageToUser(username, tMsg);
	}
}
