package com.zsmart.communale.dao;
import com.zsmart.communale.bean.Secteur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface SecteurDao extends JpaRepository<Secteur,Long> {




}
