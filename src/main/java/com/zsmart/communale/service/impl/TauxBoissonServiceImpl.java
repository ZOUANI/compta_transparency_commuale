package com.zsmart.communale.service.impl;

import com.zsmart.communale.service.facade.TauxBoissonService;
import com.zsmart.communale.dao.TauxBoissonDao;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TauxBoisson;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import org.springframework.stereotype.Service;
import java.util.List;
import com.zsmart.communale.bean.CategorieBoisson;
import com.zsmart.communale.service.facade.CategorieBoissonService;

@Service

public class TauxBoissonServiceImpl implements TauxBoissonService {

    @Autowired

    private TauxBoissonDao tauxboissonDao;

    @Autowired

    private EntityManager entityManager;

    @Autowired

    private CategorieBoissonService categorieboissonService;

    @Override
    public TauxBoisson save(TauxBoisson tauxboisson) {

        if (tauxboisson == null) {
            return null;
        } else {
            tauxboissonDao.save(tauxboisson);
            return tauxboisson;
        }
    }

    @Override
    public List< TauxBoisson> findAll() {
        return tauxboissonDao.findAll();
    }

    @Override
    public TauxBoisson findById(Long id) {
        return tauxboissonDao.getOne(id);
    }

    @Override
    public int delete(TauxBoisson tauxboisson) {
        if (tauxboisson == null) {
            return -1;
        } else {
            tauxboissonDao.delete(tauxboisson);
            return 1;
        }
    }

    @Override
    public void deleteById(Long id) {
        tauxboissonDao.deleteById(id);
    }

    public void clone(TauxBoisson tauxboisson, TauxBoisson tauxboissonClone) {
        if (tauxboisson != null && tauxboissonClone != null) {
            tauxboissonClone.setId(tauxboisson.getId());
            tauxboissonClone.setMontantParNuite(tauxboisson.getMontantParNuite());
            tauxboissonClone.setMajorationTrim(tauxboisson.getMajorationTrim());
            tauxboissonClone.setPenaliteTrim(tauxboisson.getPenaliteTrim());
            tauxboissonClone.setMajorationAnnuelle(tauxboisson.getMajorationAnnuelle());
            tauxboissonClone.setPenaliteAnnuelle(tauxboisson.getPenaliteAnnuelle());
            tauxboissonClone.setDateApplicationDebut(tauxboisson.getDateApplicationDebut());
            tauxboissonClone.setDateApplicationFin(tauxboisson.getDateApplicationFin());
            tauxboissonClone.setCategorieBoisson(categorieboissonService.clone(tauxboisson.getCategorieBoisson()));
        }
    }

    public TauxBoisson clone(TauxBoisson tauxboisson) {
        if (tauxboisson == null) {
            return null;
        } else {
            TauxBoisson tauxboissonClone = new TauxBoisson();
            clone(tauxboisson, tauxboissonClone);
            return tauxboissonClone;
        }
    }

    public List<TauxBoisson> clone(List<TauxBoisson> tauxboissons) {
        if (tauxboissons == null) {
            return null;
        } else {
            List<TauxBoisson> tauxboissonsClone = new ArrayList();
            tauxboissons.forEach((tauxboisson) -> {
                tauxboissonsClone.add(clone(tauxboisson));
            });
            return tauxboissonsClone;
        }
    }

    @Override
    public List< TauxBoisson> findByCriteria(Long idMin, Long idMax, BigDecimal montantParNuiteMin, BigDecimal montantParNuiteMax, BigDecimal majorationTrimMin, BigDecimal majorationTrimMax, BigDecimal penaliteTrimMin, BigDecimal penaliteTrimMax, BigDecimal majorationAnnuelleMin, BigDecimal majorationAnnuelleMax, BigDecimal penaliteAnnuelleMin, BigDecimal penaliteAnnuelleMax, Date dateApplicationDebutMin, Date dateApplicationDebutMax, Date dateApplicationFinMin, Date dateApplicationFinMax) {
        return entityManager.createQuery(constructQuery(idMin, idMax, montantParNuiteMin, montantParNuiteMax, majorationTrimMin, majorationTrimMax, penaliteTrimMin, penaliteTrimMax, majorationAnnuelleMin, majorationAnnuelleMax, penaliteAnnuelleMin, penaliteAnnuelleMax, dateApplicationDebutMin, dateApplicationDebutMax, dateApplicationFinMin, dateApplicationFinMax)).getResultList();
    }

    private String constructQuery(Long idMin, Long idMax, BigDecimal montantParNuiteMin, BigDecimal montantParNuiteMax, BigDecimal majorationTrimMin, BigDecimal majorationTrimMax, BigDecimal penaliteTrimMin, BigDecimal penaliteTrimMax, BigDecimal majorationAnnuelleMin, BigDecimal majorationAnnuelleMax, BigDecimal penaliteAnnuelleMin, BigDecimal penaliteAnnuelleMax, Date dateApplicationDebutMin, Date dateApplicationDebutMax, Date dateApplicationFinMin, Date dateApplicationFinMax) {
        String query = "SELECT t FROM TauxBoisson t where 1=1 ";
        query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
        query += SearchUtil.addConstraintMinMax("t", "montantParNuite", montantParNuiteMin, montantParNuiteMax);
        query += SearchUtil.addConstraintMinMax("t", "majorationTrim", majorationTrimMin, majorationTrimMax);
        query += SearchUtil.addConstraintMinMax("t", "penaliteTrim", penaliteTrimMin, penaliteTrimMax);
        query += SearchUtil.addConstraintMinMax("t", "majorationAnnuelle", majorationAnnuelleMin, majorationAnnuelleMax);
        query += SearchUtil.addConstraintMinMax("t", "penaliteAnnuelle", penaliteAnnuelleMin, penaliteAnnuelleMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateApplicationDebut", dateApplicationDebutMin, dateApplicationDebutMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateApplicationFin", dateApplicationFinMin, dateApplicationFinMax);

        return query;
    }
}
