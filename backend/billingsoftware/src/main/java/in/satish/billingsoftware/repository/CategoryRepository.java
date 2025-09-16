package in.satish.billingsoftware.repository;

import in.satish.billingsoftware.entity.CategoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<CategoryEntity,Long>
{
	

}
