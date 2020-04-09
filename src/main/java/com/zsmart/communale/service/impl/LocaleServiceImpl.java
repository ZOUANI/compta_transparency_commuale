package com.zsmart.communale.service.impl;

import com.zsmart.communale.service.facade.LocaleService;
import com.zsmart.communale.dao.LocaleDao;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Service;
import java.util.List;
import com.zsmart.communale.service.facade.RueService;
import com.zsmart.communale.service.facade.RedevableService;
import com.zsmart.communale.service.facade.CategorieSejourService;
import com.zsmart.communale.service.facade.CategorieBoissonService;

@Service

public class LocaleServiceImpl implements LocaleService {

    @Autowired

    private LocaleDao localeDao;

    @Autowired

    private EntityManager entityManager;

    @Autowired

    private RueService rueService;

    @Autowired

    private RedevableService redevableService;

    @Autowired

    private CategorieSejourService categoriesejourService;

    @Autowired

    private CategorieBoissonService categorieboissonService;

    @Override
    public Locale save(Locale locale) {

        if (locale == null) {
            return null;
        } else {
            localeDao.save(locale);
            return locale;
        }
    }

    @Override
    public List< Locale> findAll() {
        return localeDao.findAll();
    }

    @Override
    public Locale findById(Long id) {
        return localeDao.getOne(id);
    }

    @Override
    public Locale findByReference(String reference) {
        return localeDao.findByReference(reference);
    }

    @Override
    public int delete(Locale locale) {
        if (locale == null) {
            return -1;
        } else {
            localeDao.delete(locale);
            return 1;
        }
    }

    @Override
    public void deleteById(Long id) {
        localeDao.deleteById(id);
    }

    @Override
    public void deleteByReference(String reference) {
        localeDao.deleteByReference(reference);
    }

    public void clone(Locale locale, Locale localeClone) {
        if (locale != null && localeClone != null) {
            localeClone.setId(locale.getId());
            localeClone.setReference(locale.getReference());
            localeClone.setDernierTrimBoissonPaye(locale.getDernierTrimBoissonPaye());
            localeClone.setDernierAnneeBoissonPaye(locale.getDernierAnneeBoissonPaye());
            localeClone.setDernierAnneeBoissonDeclare(locale.getDernierAnneeBoissonDeclare());
            localeClone.setDernierTrimSejourPaye(locale.getDernierTrimSejourPaye());
            localeClone.setDernierAnneeSejourPaye(locale.getDernierAnneeSejourPaye());
            localeClone.setDernierAnneeSejourDeclare(locale.getDernierAnneeSejourDeclare());
            localeClone.setRue(rueService.clone(locale.getRue()));
            localeClone.setRedevable(redevableService.clone(locale.getRedevable()));
            localeClone.setCategorieSejour(categoriesejourService.clone(locale.getCategorieSejour()));
            localeClone.setCategorieBoisson(categorieboissonService.clone(locale.getCategorieBoisson()));
        }
    }

    public Locale clone(Locale locale) {
        if (locale == null) {
            return null;
        } else {
            Locale localeClone = new Locale();
            clone(locale, localeClone);
            return localeClone;
        }
    }

    public List<Locale> clone(List<Locale> locales) {
        if (locales == null) {
            return null;
        } else {
            List<Locale> localesClone = new ArrayList();
            locales.forEach((locale) -> {
                localesClone.add(clone(locale));
            });
            return localesClone;
        }
    }

    @Override
    public List< Locale> findByCriteria(String reference, Long idMin, Long idMax, Integer dernierTrimBoissonPayeMin, Integer dernierTrimBoissonPayeMax, Integer dernierAnneeBoissonPayeMin, Integer dernierAnneeBoissonPayeMax, Integer dernierAnneeBoissonDeclareMin, Integer dernierAnneeBoissonDeclareMax, Integer dernierTrimSejourPayeMin, Integer dernierTrimSejourPayeMax, Integer dernierAnneeSejourPayeMin, Integer dernierAnneeSejourPayeMax, Integer dernierAnneeSejourDeclareMin, Integer dernierAnneeSejourDeclareMax) {
        return entityManager.createQuery(constructQuery(reference, idMin, idMax, dernierTrimBoissonPayeMin, dernierTrimBoissonPayeMax, dernierAnneeBoissonPayeMin, dernierAnneeBoissonPayeMax, dernierAnneeBoissonDeclareMin, dernierAnneeBoissonDeclareMax, dernierTrimSejourPayeMin, dernierTrimSejourPayeMax, dernierAnneeSejourPayeMin, dernierAnneeSejourPayeMax, dernierAnneeSejourDeclareMin, dernierAnneeSejourDeclareMax)).getResultList();
    }

    private String constructQuery(String reference, Long idMin, Long idMax, Integer dernierTrimBoissonPayeMin, Integer dernierTrimBoissonPayeMax, Integer dernierAnneeBoissonPayeMin, Integer dernierAnneeBoissonPayeMax, Integer dernierAnneeBoissonDeclareMin, Integer dernierAnneeBoissonDeclareMax, Integer dernierTrimSejourPayeMin, Integer dernierTrimSejourPayeMax, Integer dernierAnneeSejourPayeMin, Integer dernierAnneeSejourPayeMax, Integer dernierAnneeSejourDeclareMin, Integer dernierAnneeSejourDeclareMax) {
        String query = "SELECT l FROM Locale l where 1=1 ";
        query += SearchUtil.addConstraint("l", "reference", "=", reference);
        query += SearchUtil.addConstraintMinMax("l", "id", idMin, idMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierTrimBoissonPaye", dernierTrimBoissonPayeMin, dernierTrimBoissonPayeMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierAnneeBoissonPaye", dernierAnneeBoissonPayeMin, dernierAnneeBoissonPayeMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierAnneeBoissonDeclare", dernierAnneeBoissonDeclareMin, dernierAnneeBoissonDeclareMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierTrimSejourPaye", dernierTrimSejourPayeMin, dernierTrimSejourPayeMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierAnneeSejourPaye", dernierAnneeSejourPayeMin, dernierAnneeSejourPayeMax);
        query += SearchUtil.addConstraintMinMax("l", "dernierAnneeSejourDeclare", dernierAnneeSejourDeclareMin, dernierAnneeSejourDeclareMax);

        return query;
    }
}
