package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.TauxBoisson;
import com.zsmart.communale.bean.TaxeAnnuelBoisson;
import com.zsmart.communale.bean.TaxeTrimBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeTrimBoissonDao extends JpaRepository<TaxeTrimBoisson,Long> {


	 public TaxeTrimBoisson findByLocale(Locale locale);
	 public TaxeTrimBoisson findByRedevable(Redevable redevable);
	 public TaxeTrimBoisson findByTauxBoisson(TauxBoisson tauxBoisson);
	 public TaxeTrimBoisson findByTaxeAnnuelBoisson(TaxeAnnuelBoisson taxeAnnuelBoisson);

	 public int deleteByLocale(Locale locale);
	 public int deleteByRedevable(Redevable redevable);
	 public int deleteByTauxBoisson(TauxBoisson tauxBoisson);
	 public int deleteByTaxeAnnuelBoisson(TaxeAnnuelBoisson taxeAnnuelBoisson);

}
