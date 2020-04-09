package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.TauxSejour;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.TaxeAnnuelSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeAnnuelSejourDao extends JpaRepository<TaxeAnnuelSejour,Long> {


	 public TaxeAnnuelSejour findByLocale(Locale locale);
	 public TaxeAnnuelSejour findByRedevable(Redevable redevable);
	 public TaxeAnnuelSejour findByTauxSejour(TauxSejour tauxSejour);
	 public TaxeAnnuelSejour findByLocal(Locale local);

	 public int deleteByLocale(Locale locale);
	 public int deleteByRedevable(Redevable redevable);
	 public int deleteByTauxSejour(TauxSejour tauxSejour);
	 public int deleteByLocal(Locale local);

}
