package org.nd4j.linalg.api.blas.impl;

import org.nd4j.linalg.api.blas.Level1;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.buffer.IntBuffer;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * @author Audrey Loeffel
 */
public abstract class SparseBaseLevel1 extends SparseBaseLevel implements Level1{

    /**
     * computes a vector-vector dot product.
     *
     * @param n number of accessed element
     * @param alpha
     * @param X an INDArray
     * @param Y an INDArray
     * @return the vector-vector dot product of X and Y
     */
    @Override
    public double dot(int n, double alpha, INDArray X, INDArray Y) {

        // TODO should we verify if the arrays are indeed sparse ? -> need to get the pointers array
        // What is alpha ?

        switch(X.data().dataType()){
            case DOUBLE:
                //TODO call ddoti
                break;
            case FLOAT:
                // TODO call sdoti
                break;
            case HALF:
                // ??
                break;
            default:
        }
        return 0;
    }

    @Override
    public double dot(int n, DataBuffer dx, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY) {
        return 0;
    }

    @Override
    public IComplexNumber dot(int n, IComplexNumber alpha, IComplexNDArray X, IComplexNDArray Y) {
        return null;
    }

    @Override
    public double nrm2(INDArray arr) {
        return 0;
    }

    @Override
    public IComplexNumber nrm2(IComplexNDArray arr) {
        return null;
    }

    @Override
    public double asum(INDArray arr) {
        return 0;
    }

    @Override
    public double asum(int n, DataBuffer x, int offsetX, int incrX) {
        return 0;
    }

    @Override
    public IComplexNumber asum(IComplexNDArray arr) {
        return null;
    }

    @Override
    public int iamax(INDArray arr) {
        return 0;
    }

    @Override
    public int iamax(int n, INDArray arr, int stride) {
        return 0;
    }

    @Override
    public int iamax(int n, DataBuffer x, int offsetX, int incrX) {
        return 0;
    }

    @Override
    public int iamax(IComplexNDArray arr) {
        return 0;
    }

    @Override
    public int iamin(INDArray arr) {
        return 0;
    }

    @Override
    public int iamin(IComplexNDArray arr) {
        return 0;
    }

    @Override
    public void swap(INDArray x, INDArray y) {

    }

    @Override
    public void swap(IComplexNDArray x, IComplexNDArray y) {

    }

    @Override
    public void copy(INDArray x, INDArray y) {

    }

    @Override
    public void copy(int n, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY) {

    }

    @Override
    public void copy(IComplexNDArray x, IComplexNDArray y) {

    }

    @Override
    public void axpy(int n, double alpha, INDArray x, INDArray y) {

    }

    @Override
    public void axpy(int n, double alpha, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY) {

    }

    @Override
    public void axpy(int n, IComplexNumber alpha, IComplexNDArray x, IComplexNDArray y) {

    }

    @Override
    public void rotg(INDArray a, INDArray b, INDArray c, INDArray s) {

    }

    @Override
    public void rot(int N, INDArray X, INDArray Y, double c, double s) {

    }

    @Override
    public void rot(int N, IComplexNDArray X, IComplexNDArray Y, IComplexNumber c, IComplexNumber s) {

    }

    @Override
    public void rotmg(INDArray d1, INDArray d2, INDArray b1, double b2, INDArray P) {

    }

    @Override
    public void rotmg(IComplexNDArray d1, IComplexNDArray d2, IComplexNDArray b1, IComplexNumber b2, IComplexNDArray P) {

    }

    @Override
    public void scal(int N, double alpha, INDArray X) {

    }

    @Override
    public void scal(int N, IComplexNumber alpha, IComplexNDArray X) {

    }

    @Override
    public boolean supportsDataBufferL1Ops() {
        return false;
    }


    /*
    * ===========================================================================
    * Prototypes for level 1 BLAS functions (complex are recast as routines)
    * ===========================================================================
    */

    protected abstract double ddoti(int N, INDArray X, IntBuffer indx, INDArray Y);

    protected abstract double sdoti(int N, INDArray X, IntBuffer indx, INDArray Y);




    /*
     * Functions having prefixes Z and C only
     */
    /*


    /*
     * Functions having prefixes S D SC DZ
     */

    /*
     * Functions having standard 4 prefixes (S D C Z)
     */

    /*
     * ===========================================================================
     * Prototypes for level 1 BLAS routines
     * ===========================================================================
     */

    /*
     * Routines with standard 4 prefixes (s, d, c, z)
     */


    /*
     * Routines with S and D prefix only
     */

    /*
     * Routines with S D C Z CS and ZD prefixes
     */

    }