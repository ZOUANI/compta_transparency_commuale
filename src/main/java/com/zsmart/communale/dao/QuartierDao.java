package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Secteur;
import com.zsmart.communale.bean.Quartier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface QuartierDao extends JpaRepository<Quartier,Long> {


	 public Quartier findBySecteur(Secteur secteur);

	 public int deleteBySecteur(Secteur secteur);

}
