package com.company.customerservice.screen.customer;

import com.company.customerservice.dto.EligibilityRequest;
import com.company.customerservice.dto.EligibilityResponse;
import com.company.customerservice.dto.EmailRequest;
import com.company.customerservice.service.ApiService;
import io.jmix.ui.screen.*;
import com.company.customerservice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

@UiController("Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private ApiService<EligibilityRequest, EligibilityResponse> apiServiceEligibility;
    @Inject
    private ApiService<EmailRequest, String> apiServiceEmail;



    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Customer customer = getEditedEntity();
        EligibilityResponse response = apiServiceEligibility.makePostRequest(
                "ELIGIBILITY-SERVICE/eligible",
                new EligibilityRequest(customer.getFullName(), customer.getIdNumber()),
                new EligibilityResponse()
        );
        apiServiceEmail.makePostRequest(
                "COMMUNICATION-SERVICE/email",
                new EmailRequest("Some Test", customer.getEmail(), "noreply@mail.com", response.getMessage()),
                "");
        customer.setActive(response.isEligible());
        customer.setApproved(response.isEligible());

        event.resume();
    }


}