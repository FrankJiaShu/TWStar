import com.ljh.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;

/**
 * Created by ljh on 2017/11/5.
 */
public class JunitTest {
    private SqlSession sqlSession;
    private Student student;
    @Before
    public void init() throws Exception{
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        sqlSession = sqlSessionFactory.openSession();
        student = new Student();
    }
    @Test
    public void selectStudentById() throws Exception{
        student.setId("1");
        student.setName("ljh");
        student.setPassword("1234");
        Student student1 = sqlSession.selectOne("selectStudentById",student);
        System.out.println(student1);
        sqlSession.close();
    }
    @Test
    public void insertStudent() throws Exception{
        student.setId("3");
        student.setName("Jerry");
        student.setPassword("333");
        sqlSession.insert("insertStudent",student);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteStudentById() throws Exception{
        student.setId("3");
        sqlSession.delete("deleteStudentById",student);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateStudentById() throws Exception{
        student.setId("3");
        student.setName("jack");
        student.setPassword("123");
        sqlSession.update("updateStudentById",student);
        sqlSession.commit();
        sqlSession.close();
    }
}
