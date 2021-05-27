package com.abc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abc.bean.Product;
import com.abc.util.DBUtil;

public class ProductDao {

public boolean save(Product product) {
		
		Connection con = null;
		PreparedStatement ps = null;
		boolean flag = false;
		
		String insertSql = "insert into product_tbl values(?,?,?)";
		
		try {			
			con = DBUtil.getDBConnection();			
			ps = con.prepareStatement(insertSql);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getProductPrice());			
			int result = ps.executeUpdate();	
			if(result > 0 ) {
				flag = true;
			}						
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
					con.close();					
				}				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
         return flag;		
	}
}
