package com.sofka.software._4_iva;

import com.sofka.software._4_iva.abstracts.AgregarIVAAbstract;

public class AgregarIVA implements AgregarIVAAbstract {
    private static final double IVA = 0.21;

    public void doSomething() {
        // Do nothing because of X and Y.
    }

    public void doSomethingElse() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getPrecioFinal(double precioNormal){
        return precioNormal+precioNormal*IVA;
    }
}
