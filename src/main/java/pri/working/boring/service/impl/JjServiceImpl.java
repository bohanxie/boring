package pri.working.boring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.working.boring.entity.Jj;
import pri.working.boring.mapper.JjMapper;
import pri.working.boring.service.JjService;

import java.util.List;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName JjServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月25日 11:02:00
 */
@Service
public class JjServiceImpl implements JjService {

    @Autowired
    private JjMapper jjMapper;

    @Override
    public List<Jj> getAll() {
        return jjMapper.getAll();
    }
}
