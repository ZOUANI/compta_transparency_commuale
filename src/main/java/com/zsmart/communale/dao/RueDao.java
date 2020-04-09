package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Quartier;
import com.zsmart.communale.bean.Rue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface RueDao extends JpaRepository<Rue,Long> {


	 public Rue findByQuartier(Quartier quartier);

	 public int deleteByQuartier(Quartier quartier);

}
