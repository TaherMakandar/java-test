package springmvcp4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao 
{
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Emp p) throws DataAccessException
	{    
	    String sql="insert into emp(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
	    return template.update(sql);    
	}    
	
	public List<Emp> getEmployees(){    
	    return template.query("select * from Emp99",new RowMapper<Emp>(){    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
	            Emp e=new Emp();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getInt(3));    
	            e.setDesignation(rs.getString(4));    
	            return e;    
	        }    
	    });    
	}
}
