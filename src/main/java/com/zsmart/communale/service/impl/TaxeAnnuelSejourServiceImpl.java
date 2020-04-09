package com.zsmart.communale.service.impl;

import com.zsmart.communale.service.facade.TaxeAnnuelSejourService;
import com.zsmart.communale.dao.TaxeAnnuelSejourDao;
import com.zsmart.communale.service.util.SearchUtil;
import com.zsmart.communale.bean.TaxeAnnuelSejour;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import java.util.Date;
import org.springframework.stereotype.Service;
import java.util.List;
import com.zsmart.communale.service.facade.RedevableService;
import com.zsmart.communale.service.facade.TauxSejourService;
import com.zsmart.communale.service.facade.LocaleService;
import com.zsmart.communale.service.facade.TaxeTrimSejourService;
import com.zsmart.communale.bean.TaxeTrimSejour;

@Service

public class TaxeAnnuelSejourServiceImpl implements TaxeAnnuelSejourService {

    @Autowired

    private TaxeAnnuelSejourDao taxeannuelsejourDao;

    @Autowired

    private EntityManager entityManager;

    @Autowired

    private TaxeTrimSejourService taxetrimsejourService;

    @Autowired

    private LocaleService localeService;

    @Autowired

    private RedevableService redevableService;

    @Autowired

    private TauxSejourService tauxsejourService;

    @Override
    public TaxeAnnuelSejour save(TaxeAnnuelSejour taxeannuelsejour) {

        if (taxeannuelsejour == null) {
            return null;
        } else {
            taxeannuelsejourDao.save(taxeannuelsejour);
            return taxeannuelsejour;
        }
    }

    @Override
    public TaxeAnnuelSejour saveWithTaxeTrimSejours(TaxeAnnuelSejour taxeannuelsejour) {

        if (taxeannuelsejour == null) {
            return null;
        } else {
            if (taxeannuelsejour.getTaxeTrimSejours().isEmpty()) {
                return null;
            } else {
                taxeannuelsejourDao.save(taxeannuelsejour);
                for (TaxeTrimSejour taxetrimsejour : taxeannuelsejour.getTaxeTrimSejours()) {
                    taxetrimsejour.setTaxeAnnuelSejour(taxeannuelsejour);
                    taxetrimsejourService.save(taxetrimsejour);
                }
                return taxeannuelsejour;
            }
        }
    }

    @Override
    public List< TaxeAnnuelSejour> findAll() {
        return taxeannuelsejourDao.findAll();
    }

    @Override
    public TaxeAnnuelSejour findById(Long id) {
        return taxeannuelsejourDao.getOne(id);
    }

    @Override
    public int delete(TaxeAnnuelSejour taxeannuelsejour) {
        if (taxeannuelsejour == null) {
            return -1;
        } else {
            taxeannuelsejourDao.delete(taxeannuelsejour);
            return 1;
        }
    }

    @Override
    public void deleteById(Long id) {
        taxeannuelsejourDao.deleteById(id);
    }

    public void clone(TaxeAnnuelSejour taxeannuelsejour, TaxeAnnuelSejour taxeannuelsejourClone) {
        if (taxeannuelsejour != null && taxeannuelsejourClone != null) {
            taxeannuelsejourClone.setId(taxeannuelsejour.getId());
            taxeannuelsejourClone.setAnnee(taxeannuelsejour.getAnnee());
            taxeannuelsejourClone.setDatePresentation(taxeannuelsejour.getDatePresentation());
            taxeannuelsejourClone.setMontantTotal(taxeannuelsejour.getMontantTotal());
            taxeannuelsejourClone.setMontantBase(taxeannuelsejour.getMontantBase());
            taxeannuelsejourClone.setMontantRetard(taxeannuelsejour.getMontantRetard());
            taxeannuelsejourClone.setMontantMajoration(taxeannuelsejour.getMontantMajoration());
            taxeannuelsejourClone.setMontantPenalite(taxeannuelsejour.getMontantPenalite());
            taxeannuelsejourClone.setNomberMoisRetard(taxeannuelsejour.getNomberMoisRetard());
            taxeannuelsejourClone.setDateValidation(taxeannuelsejour.getDateValidation());
            taxeannuelsejourClone.setDateSoumission(taxeannuelsejour.getDateSoumission());
            taxeannuelsejourClone.setDateAffectationComptable(taxeannuelsejour.getDateAffectationComptable());
            taxeannuelsejourClone.setDateFinalisation(taxeannuelsejour.getDateFinalisation());
            taxeannuelsejourClone.setDateSaisie(taxeannuelsejour.getDateSaisie());
            taxeannuelsejourClone.setLocale(localeService.clone(taxeannuelsejour.getLocale()));
            taxeannuelsejourClone.setRedevable(redevableService.clone(taxeannuelsejour.getRedevable()));
            taxeannuelsejourClone.setTauxSejour(tauxsejourService.clone(taxeannuelsejour.getTauxSejour()));
            taxeannuelsejourClone.setTaxeTrimSejours(taxetrimsejourService.clone(taxeannuelsejour.getTaxeTrimSejours()));
        }
    }

    public TaxeAnnuelSejour clone(TaxeAnnuelSejour taxeannuelsejour) {
        if (taxeannuelsejour == null) {
            return null;
        } else {
            TaxeAnnuelSejour taxeannuelsejourClone = new TaxeAnnuelSejour();
            clone(taxeannuelsejour, taxeannuelsejourClone);
            return taxeannuelsejourClone;
        }
    }

    public List<TaxeAnnuelSejour> clone(List<TaxeAnnuelSejour> taxeannuelsejours) {
        if (taxeannuelsejours == null) {
            return null;
        } else {
            List<TaxeAnnuelSejour> taxeannuelsejoursClone = new ArrayList();
            taxeannuelsejours.forEach((taxeannuelsejour) -> {
                taxeannuelsejoursClone.add(clone(taxeannuelsejour));
            });
            return taxeannuelsejoursClone;
        }
    }

    @Override
    public List< TaxeAnnuelSejour> findByCriteria(Long idMin, Long idMax, Integer anneeMin, Integer anneeMax, Date datePresentationMin, Date datePresentationMax, BigDecimal montantTotalMin, BigDecimal montantTotalMax, BigDecimal montantBaseMin, BigDecimal montantBaseMax, BigDecimal montantRetardMin, BigDecimal montantRetardMax, BigDecimal montantMajorationMin, BigDecimal montantMajorationMax, BigDecimal montantPenaliteMin, BigDecimal montantPenaliteMax, Integer nomberMoisRetardMin, Integer nomberMoisRetardMax, Date dateValidationMin, Date dateValidationMax, Date dateSoumissionMin, Date dateSoumissionMax, Date dateAffectationComptableMin, Date dateAffectationComptableMax, Date dateFinalisationMin, Date dateFinalisationMax, Date dateSaisieMin, Date dateSaisieMax) {
        return entityManager.createQuery(constructQuery(idMin, idMax, anneeMin, anneeMax, datePresentationMin, datePresentationMax, montantTotalMin, montantTotalMax, montantBaseMin, montantBaseMax, montantRetardMin, montantRetardMax, montantMajorationMin, montantMajorationMax, montantPenaliteMin, montantPenaliteMax, nomberMoisRetardMin, nomberMoisRetardMax, dateValidationMin, dateValidationMax, dateSoumissionMin, dateSoumissionMax, dateAffectationComptableMin, dateAffectationComptableMax, dateFinalisationMin, dateFinalisationMax, dateSaisieMin, dateSaisieMax)).getResultList();
    }

    private String constructQuery(Long idMin, Long idMax, Integer anneeMin, Integer anneeMax, Date datePresentationMin, Date datePresentationMax, BigDecimal montantTotalMin, BigDecimal montantTotalMax, BigDecimal montantBaseMin, BigDecimal montantBaseMax, BigDecimal montantRetardMin, BigDecimal montantRetardMax, BigDecimal montantMajorationMin, BigDecimal montantMajorationMax, BigDecimal montantPenaliteMin, BigDecimal montantPenaliteMax, Integer nomberMoisRetardMin, Integer nomberMoisRetardMax, Date dateValidationMin, Date dateValidationMax, Date dateSoumissionMin, Date dateSoumissionMax, Date dateAffectationComptableMin, Date dateAffectationComptableMax, Date dateFinalisationMin, Date dateFinalisationMax, Date dateSaisieMin, Date dateSaisieMax) {
        String query = "SELECT t FROM TaxeAnnuelSejour t where 1=1 ";
        query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
        query += SearchUtil.addConstraintMinMax("t", "annee", anneeMin, anneeMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " datePresentation", datePresentationMin, datePresentationMax);
        query += SearchUtil.addConstraintMinMax("t", "montantTotal", montantTotalMin, montantTotalMax);
        query += SearchUtil.addConstraintMinMax("t", "montantBase", montantBaseMin, montantBaseMax);
        query += SearchUtil.addConstraintMinMax("t", "montantRetard", montantRetardMin, montantRetardMax);
        query += SearchUtil.addConstraintMinMax("t", "montantMajoration", montantMajorationMin, montantMajorationMax);
        query += SearchUtil.addConstraintMinMax("t", "montantPenalite", montantPenaliteMin, montantPenaliteMax);
        query += SearchUtil.addConstraintMinMax("t", "nomberMoisRetard", nomberMoisRetardMin, nomberMoisRetardMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateValidation", dateValidationMin, dateValidationMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateSoumission", dateSoumissionMin, dateSoumissionMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateFinalisation", dateFinalisationMin, dateFinalisationMax);
        query += SearchUtil.addConstraintMinMaxDate("t", " dateSaisie", dateSaisieMin, dateSaisieMax);

        return query;
    }
}
