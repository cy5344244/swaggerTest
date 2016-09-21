package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Contact;

@Controller
@RequestMapping("/test")
public class TestController {

	@ApiOperation(value = "获取信息接口")
	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> queryAPIInfo() {
		//logger.info("查询更新新版本号");
		Map<String, String> map = new HashMap<String, String>();
		map.put("language", "Java");
		map.put("format", "JSON");
		map.put("tools", "swagger");
		map.put("version", "1.0");
		return map;
	}

	@RequestMapping(value = "/update.do/{id}", method = RequestMethod.POST)
	public void update(@ApiParam(name = "id", value = "编号", required = true) @PathVariable Integer id,
			@RequestBody Contact contact) {
		contact.setName(String.valueOf(id));
	}
	
    @ResponseBody  
    @RequestMapping(value = "/getFun", method = RequestMethod.GET)  
    @ApiOperation(nickname = "swagger-helloworld", value = "Swagger的世界", notes = "测试HelloWorld")  
    public String helloWorld(@ApiParam(value = "昵称") @RequestParam String nickname) {
    	System.out.println("hello");
        return "Hello world, " + nickname;  
    }
    
    @ResponseBody
    @RequestMapping(value = "/postFun", method = RequestMethod.POST)
    @ApiOperation(nickname = "swagger-objectio", value = "Swagger的ObjectIO", notes = "测试对象输入输出")
    public Object objectIo(@ApiParam(value = "输入") @RequestBody String input) {
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("input", input);
    	map.put("input", input);
        return map;
    }

}
