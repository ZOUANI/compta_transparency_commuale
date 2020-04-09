package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Locale;
import com.zsmart.communale.bean.Redevable;
import com.zsmart.communale.bean.TauxSejour;
import com.zsmart.communale.bean.TaxeAnnuelSejour;
import com.zsmart.communale.bean.TaxeTrimSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeTrimSejourDao extends JpaRepository<TaxeTrimSejour,Long> {


	 public TaxeTrimSejour findByLocale(Locale locale);
	 public TaxeTrimSejour findByRedevable(Redevable redevable);
	 public TaxeTrimSejour findByTauxSejour(TauxSejour tauxSejour);
	 public TaxeTrimSejour findByTaxeAnnuelSejour(TaxeAnnuelSejour taxeAnnuelSejour);

	 public int deleteByLocale(Locale locale);
	 public int deleteByRedevable(Redevable redevable);
	 public int deleteByTauxSejour(TauxSejour tauxSejour);
	 public int deleteByTaxeAnnuelSejour(TaxeAnnuelSejour taxeAnnuelSejour);

}
