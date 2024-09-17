package com.loanprocessing.dto;

import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;

@SuppressWarnings("deprecation")
public class LoanApplicationsDtoValidation {
	
    @NotNull
    private Long customerId;

    @NotNull
    private BigDecimal loanAmount;

    @NotNull
    private Integer loanTerm;

    @NotNull
    private BigDecimal interestRate;

}
