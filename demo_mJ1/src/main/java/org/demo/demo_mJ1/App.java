package org.demo.demo_mJ1;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.demo.mapper.IAccountDao;
import org.demo.mapper.IAccountDao2;
import org.demo.po.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        InputStream is = Resources.getResourceAsStream("org/demo/config/config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        
        SqlSession session = ssf.openSession();
        try {
        	Account acc = new Account();
        	acc.setAccount("test dynamic");
        	acc.setId(3);
        	session.update("updateAccount",acc);
        	session.commit();
        }finally {
        	session.close();
        }
    }
    
    private static void showAccount(String msg,Account acc) {
    	System.out.println(msg);
    	System.out.println("id--"+acc.getId());
    	System.out.println("account--"+acc.getAccount());
    	System.out.println("password--"+acc.getPassword());
    }
    
}



