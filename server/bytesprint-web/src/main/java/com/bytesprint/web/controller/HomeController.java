package com.bytesprint.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @author Eason Liu
 * Create at: 2023/9/9
 */
@RestController
@RequestMapping(produces = "application/json;charset=UTF-8")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "                       _oo0oo_\n"
                + "                      o8888888o\n"
                + "                      88\" . \"88\n"
                + "                      (| -_- |)\n"
                + "                      0\\  =  /0\n"
                + "                    ___/`---'\\___\n"
                + "                  .' \\\\|     |// '.\n"
                + "                 / \\\\|||  :  |||// \\\n"
                + "                / _||||| -:- |||||- \\\n"
                + "               |   | \\\\\\  -  /// |   |\n"
                + "               | \\_|  ''\\---/''  |_/ |\n"
                + "               \\  .-\\__  '-'  ___/-. /\n"
                + "             ___'. .'  /--.--\\  `. .'___\n"
                + "          .\"\" '<  `.___\\_<|>_/___.' >' \"\".\n"
                + "         | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n"
                + "         \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /\n"
                + "     =====`-.____`.___ \\_____/___.-`___.-'=====\n"
                + "                       `=---='\n"
                + "\n"
                + "\n"
                + "     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "\n"
                + "    Startup Complete      God Bless         No BUG\n";
    }
}
