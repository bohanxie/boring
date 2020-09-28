package pri.working.boring.mapper;

import org.apache.ibatis.annotations.Mapper;
import pri.working.boring.annotation.PageAnnotation;
import pri.working.boring.entity.Jj;

import java.util.List;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName JjMapper.java
 * @Description TODO
 * @createTime 2020年09月25日 11:06:00
 */
@Mapper
public interface JjMapper {

    @PageAnnotation(pageSize = 50)
    List<Jj> getAll();
}
