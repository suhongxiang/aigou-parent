package cn.itsource.aigou.controller;

import cn.itsource.aigou.Employee;
import cn.itsource.aigou.service.IEmployeeService;
import cn.itsource.aigou.util.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {
@Autowired
private IEmployeeService employeeService;
    @PostMapping("/login")
    @ApiOperation(value = "登录接口"+"")
    public AjaxResult login(@RequestBody Map<String,Object> params) {
        String username = (String) params.get("username");
        String password = (String) params.get("password");
        Employee employee = employeeService.login(username, password);
        if (null !=employee) {
           return AjaxResult.me();//登录成功
        } else{
            return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误");
        }
    }
}
