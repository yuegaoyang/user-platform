package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * 输出 “Hello,World” Controller
 */
@Path("/register")
public class UserRegsterController implements PageController {

    @GET
    @POST
    @Path("") // /hello/world -> HelloWorldController
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "register.jsp";
    }
}
