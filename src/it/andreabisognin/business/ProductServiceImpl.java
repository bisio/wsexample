package it.andreabisognin.business;

import java.util.ArrayList;
import java.util.List;

import it.andreabisognin.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Game of Thrones");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("dildo","xxx",69.0));
		return list;
	}
}
