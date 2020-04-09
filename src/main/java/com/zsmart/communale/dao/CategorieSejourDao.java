package com.zsmart.communale.dao;
import com.zsmart.communale.bean.CategorieSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CategorieSejourDao extends JpaRepository<CategorieSejour,Long> {
	 public CategorieSejour findByReference(String reference);

	 public int deleteByReference(String reference);



}
