package it.andreabisognin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import it.andreabisognin.business.ProductServiceImpl;

@WebService(endpointInterface="it.andreabisognin.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see it.andreabisognin.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see it.andreabisognin.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category); 
	}
	
	
	/* (non-Javadoc)
	 * @see it.andreabisognin.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category); 
	}
	
	
	/* (non-Javadoc)
	 * @see it.andreabisognin.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return true;
	}
}
