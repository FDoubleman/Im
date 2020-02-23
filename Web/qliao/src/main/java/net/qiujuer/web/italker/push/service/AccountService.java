package net.qiujuer.web.italker.push.service;

import net.qiujuer.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * author:fumm
 */

// api/account/
@Path("/account")
public class AccountService {
    @GET
    @Path("/login")
    public String get() {
        return "you  get login ";
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post() {
        User user = new User();
        user.setAge(12);
        user.setName("xiaomi");
        return user;
    }
}
