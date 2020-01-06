package LangKun;

import com.langkun.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void test1(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            TbBrand tbBrand = sqlSession.selectOne("com.langkun.TbBrandMapper.queryBrandByName", "小米");
            System.out.println(tbBrand.getBrandId()+tbBrand.getBrandName());
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
