package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HelloWorldService;

@RestController
//@RequestMapping(tu możemy dodać przedrostek do resources)
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(method = RequestMethod.GET, value = "/hello-world")
    public String helloWorld() {
        return helloWorldService.hello();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello-name/{name}")
    public String helloWorldName(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(
            method = RequestMethod.GET, value = "/hello-nickname")
    public String helloNickname(@RequestParam(
            value = "name",
            required = false,
            defaultValue = "anonymous") String nickname) {
        return "Hello " + nickname;
    }
}

