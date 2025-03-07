package com.oracle.ptsdemo.healthcare.model.vo;

import oracle.jbo.Row;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 13 15:44:25 BRST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PrescriptionMedicationViewRowImpl extends ViewRowImpl {

    /**
     * This is the default constructor (do not remove).
     */
    public PrescriptionMedicationViewRowImpl() {
    }

    /**
     * Gets PrescriptionMedication entity object.
     * @return the PrescriptionMedication
     */
    public EntityImpl getPrescriptionMedication() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets Prescription entity object.
     * @return the Prescription
     */
    public EntityImpl getPrescription() {
        return (EntityImpl)getEntity(1);
    }



    @Override
    public void setNewRowState(byte state) {
        /**
         * This is required to create a new PrescriptionMedicationView row with initialized state
         * and avoid error JBO-25030
         */
        System.out.println("******************** PrescriptionMedicationViewRowImpl.setNewRowState = "+state);
        
        if (state != Row.STATUS_INITIALIZED || getNewRowState() != Row.STATUS_NEW) {
            super.setNewRowState(state);
         }
    }

}
