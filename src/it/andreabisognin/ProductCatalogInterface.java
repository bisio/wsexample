package it.andreabisognin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="TestMartCatalog")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCategories();
	
	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsv2(String category);

	@WebMethod
	boolean addProduct(String category, String product);

}