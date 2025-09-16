package in.satish.billingsoftware.service.impl;


import java.util.UUID;

import org.springframework.stereotype.Service;

import in.satish.billingsoftware.entity.CategoryEntity;
import in.satish.billingsoftware.io.CategoryRequest;
import in.satish.billingsoftware.io.CategoryResponse;
import in.satish.billingsoftware.repository.CategoryRepository;
import in.satish.billingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
	
	private final CategoryRepository categoryRepository;
	
	@Override
	public CategoryResponse add(CategoryRequest request)
	{
		CategoryEntity newCategory= convertToEntity( request);
		newCategory=categoryRepository.save(newCategory);
		return convertToResponse(newCategory);
	}
	
	private CategoryResponse convertToResponse(CategoryEntity newCategory)
	{
		return CategoryResponse.builder()
		        .categoryId(newCategory.getCategoryId())
		        .name(newCategory.getName())
		        .description(newCategory.getDescription())
		        .bgColor(newCategory.getBgColor())
		        .imgUrl(newCategory.getImgUrl())
		        .createdAt(newCategory.getCreatedAt())
		        .updatedAt(newCategory.getUpdatedAt())
		        .build();
	}
	
	private CategoryEntity convertToEntity(CategoryRequest request)
	{
		return CategoryEntity.builder().
		categoryId(UUID.randomUUID().toString())
		.name(request.getName())
		.description(request.getDescription())
		.bgColor(request.getBgColor())
		.build();
	}

}
