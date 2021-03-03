package org.geektimes.projects.user.web.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

/**
 * 输出 “Hello,World” Controller
 */
@Path("/registerUser")
public class CreateRegisterController implements PageController {
	protected Logger logger = Logger.getLogger(CreateRegisterController.class.getName());
	private UserService userService = UserServiceImpl.getUserService();
    @GET
    @POST
    @Path("") // /hello/world -> HelloWorldController
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
    	User user0 = userService.queryUserById(0L);
    	logger.info("User0==>"+user0.toString());
    	User user = new User();
        user.setEmail("abc@qq.com");
        user.setName("testman");
        user.setPassword("XXXXXXXXpwd");
        user.setPhoneNumber("1333444455566");
        boolean b = userService.register(user);
    	return "registerSuccess.jsp";
    }
}
