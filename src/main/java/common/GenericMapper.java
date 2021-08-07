package common;

import org.apache.ibatis.annotations.Param;

public interface GenericMapper <T extends BaseDO>{
    void insert(T var1);

    void update(T var1);

    T getById(@Param("id") Long var1);

    void deleteById(@Param("id") Long var1, @Param("lastModifiedBy") String var2);
}
