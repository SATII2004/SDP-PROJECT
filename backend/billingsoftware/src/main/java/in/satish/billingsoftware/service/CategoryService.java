package in.satish.billingsoftware.service;

import in.satish.billingsoftware.io.CategoryRequest;
import in.satish.billingsoftware.io.CategoryResponse;

public interface CategoryService 
{
	
	CategoryResponse add(CategoryRequest request);

}
