package com.capitolio.hiremeskills.exceptions;

public class ProblemAtConsumingCompaniesServiceException extends ProblemAtConsumingOuterServiceException{

    public ProblemAtConsumingCompaniesServiceException() {
        super("There was a problem when trying to consume the Companies service");
    }
}
