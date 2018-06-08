package com.chamodshehanka.matricesCalculator.controller;

/**
 * @author chamodshehanka on 5/28/2018
 * @project MatricesCalculator
 **/
public class CalController {

    private double c11, c12, c21, c22, a11, a12, a21, a22, det = 0;

    public CalController(){
    }
    //Dulara me comment eka makala sout ekak athule ube name eka gahala push karapn
    //TESTING 1
    //Testion 2
    public CalController(double c11, double c12, double c21, double c22) {
        this.c11 = c11;
        this.c12 = c12;
        this.c21 = c21;
        this.c22 = c22;
    }

    private void setDet(double det){
        this.det =  1/(c11 * c22 - c12 * c21);
    }

    private double getDet(){
        return det;
    }
}
