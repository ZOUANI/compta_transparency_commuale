package com.zsmart.communale.dao;
import com.zsmart.communale.bean.TypeRedevable;
import com.zsmart.communale.bean.Redevable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface RedevableDao extends JpaRepository<Redevable,Long> {


	 public Redevable findByTypeRedevable(TypeRedevable typeRedevable);

	 public int deleteByTypeRedevable(TypeRedevable typeRedevable);

}
