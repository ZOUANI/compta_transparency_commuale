package com.zsmart.communale.dao;
import com.zsmart.communale.bean.CategorieSejour;
import com.zsmart.communale.bean.TauxSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxSejourDao extends JpaRepository<TauxSejour,Long> {


	 public TauxSejour findByCategorieSejour(CategorieSejour categorieSejour);

	 public int deleteByCategorieSejour(CategorieSejour categorieSejour);

}
