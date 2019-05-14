package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.Employee;
import cn.itsource.aigou.mapper.EmployeeMapper;
import cn.itsource.aigou.service.IEmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements IEmployeeService {
    @Override
    public Employee login(String username, String password) {
        return baseMapper.selectOne(new QueryWrapper<Employee>()
                                .eq("username",username)
                                 .eq("password",password)
        );
    }
}
