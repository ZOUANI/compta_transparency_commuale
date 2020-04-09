package com.zsmart.communale.dao;
import com.zsmart.communale.bean.CategorieBoisson;
import com.zsmart.communale.bean.TauxBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxBoissonDao extends JpaRepository<TauxBoisson,Long> {


	 public TauxBoisson findByCategorieBoisson(CategorieBoisson categorieBoisson);

	 public int deleteByCategorieBoisson(CategorieBoisson categorieBoisson);

}
