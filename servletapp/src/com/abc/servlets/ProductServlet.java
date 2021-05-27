package com.abc.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bean.Product;
import com.abc.dao.ProductDao;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName  = request.getParameter("productName");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		
		ProductDao dao = new ProductDao();
		boolean result = dao.save(product);
		
		String message = "";
		
		if(result) {
			message = "Product Saved.";
		}
		else {
			message = "Product Not Saved.";
		}
		
		request.setAttribute("result", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("productresult.jsp");
		rd.forward(request, response);	
		
	}

}
