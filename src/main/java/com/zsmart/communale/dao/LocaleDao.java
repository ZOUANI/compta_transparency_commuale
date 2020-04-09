package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Rue;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.CategorieSejour;
import com.zsmart.communale.bean.CategorieBoisson;
import com.zsmart.communale.bean.Locale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface LocaleDao extends JpaRepository<Locale,Long> {
	 public Locale findByReference(String reference);

	 public int deleteByReference(String reference);

	 public Locale findByRue(Rue rue);
	 public Locale findByRedevable(Redevable redevable);
	 public Locale findByCategorieSejour(CategorieSejour categorieSejour);
	 public Locale findByCategorieBoisson(CategorieBoisson categorieBoisson);

	 public int deleteByRue(Rue rue);
	 public int deleteByRedevable(Redevable redevable);
	 public int deleteByCategorieSejour(CategorieSejour categorieSejour);
	 public int deleteByCategorieBoisson(CategorieBoisson categorieBoisson);

}
