package com.ironyard.controller.mvc;

import com.ironyard.data.IronUser;
import com.ironyard.data.Movie;
import com.ironyard.repo.IronUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by jasonskipper on 11/1/16.
 */
@Controller
@RequestMapping(path = "/mvc/movie")
public class MvcMovieController {
    private IronUserRepository ironUserRepo;
    @Autowired
    IronUserRepository userRepository = null;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String list(Map<String, Object> model)

    {
        Iterable<IronUser> foundIt = null;


        foundIt = ironUserRepo.findAll();
        // put foundit into model
        model.put("displayName", foundIt.iterator());

        return "home";
    }
}


