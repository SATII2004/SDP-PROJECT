package in.satish.billingsoftware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.satish.billingsoftware.io.CategoryRequest;
import in.satish.billingsoftware.io.CategoryResponse;
import in.satish.billingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
	
	private final CategoryService categoryService = null;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CategoryResponse addCategory(@RequestBody CategoryRequest request)
	{
		return  categoryService.add(request);
	}

}
