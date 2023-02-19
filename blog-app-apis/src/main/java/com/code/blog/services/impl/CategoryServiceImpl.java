package com.code.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.blog.entities.Category;
import com.code.blog.exceptions.ResourceNotFoundException;
import com.code.blog.payloads.CategoryDto;
import com.code.blog.repositories.CategoryRepo;
import com.code.blog.services.CategoryService;
import org.modelmapper.ModelMapper;
@Service
public class CategoryServiceImpl implements CategoryService
{ 
	@Autowired
    private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto)
	{
		Category cat=this.modelMapper.map(categoryDto,Category.class);
		Category addedCat=this.categoryRepo.save(cat);
		
		return this.modelMapper.map(addedCat,CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) 
	{
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","Category Id",categoryId));
		
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		Category updatedCat=this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedCat,CategoryDto.class);
	}

	@Override
	public void dateteCategory(Integer categoryId)
	{
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","Category Id",categoryId));	
		this.categoryRepo.delete(cat);
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) 
	{
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","Category Id",categoryId));
		
		return this.modelMapper.map(cat,CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() 
	{
		List<Category> categories=this.categoryRepo.findAll();
		
		return null;
	}

}
