package com.zsmart.communale.dao;
import com.zsmart.communale.bean.TypeRedevable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TypeRedevableDao extends JpaRepository<TypeRedevable,Long> {
	 public TypeRedevable findByReference(String reference);

	 public int deleteByReference(String reference);



}
