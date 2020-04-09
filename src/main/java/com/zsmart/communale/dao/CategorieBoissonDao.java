package com.zsmart.communale.dao;
import com.zsmart.communale.bean.CategorieBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CategorieBoissonDao extends JpaRepository<CategorieBoisson,Long> {
	 public CategorieBoisson findByReference(String reference);

	 public int deleteByReference(String reference);



}
