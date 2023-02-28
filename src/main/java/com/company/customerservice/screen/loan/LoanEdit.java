package com.company.customerservice.screen.loan;

import io.jmix.ui.screen.*;
import com.company.customerservice.entity.Loan;

@UiController("Loan.edit")
@UiDescriptor("loan-edit.xml")
@EditedEntityContainer("loanDc")
public class LoanEdit extends StandardEditor<Loan> {
}