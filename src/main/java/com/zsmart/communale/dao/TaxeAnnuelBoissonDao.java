package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.TauxBoisson;
import com.zsmart.communale.bean.TaxeAnnuelBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeAnnuelBoissonDao extends JpaRepository<TaxeAnnuelBoisson,Long> {


	 public TaxeAnnuelBoisson findByLocale(Locale locale);
	 public TaxeAnnuelBoisson findByRedevable(Redevable redevable);
	 public TaxeAnnuelBoisson findByTauxSejour(TauxBoisson tauxSejour);

	 public int deleteByLocale(Locale locale);
	 public int deleteByRedevable(Redevable redevable);
	 public int deleteByTauxSejour(TauxBoisson tauxSejour);

}
