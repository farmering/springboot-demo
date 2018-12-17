package ss.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.domain.User;

@RestController
public class UserController {
	/**
	 * 默认会以json的格式返回
	 * @return
	 */
    @RequestMapping("/getUser")
    public User getPerson() {
    	User user=new User();
    	user.setName("李大国");
    	user.setAddress("山东济南市");
    	user.setAge(20);
        return user;
    }
}