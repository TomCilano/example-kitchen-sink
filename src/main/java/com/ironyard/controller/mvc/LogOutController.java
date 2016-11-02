package com.ironyard.controller.mvc;

import org.apache.catalina.Session;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Tom on 11/1/16.
 */
@Controller
public class LogOutController {
    @RequestMapping(value = "/mvc/logout", method = RequestMethod.GET)
    public String closeSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/mvc/login.jsp";
    }
}

