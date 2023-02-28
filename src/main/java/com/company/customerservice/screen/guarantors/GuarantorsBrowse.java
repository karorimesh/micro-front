package com.company.customerservice.screen.guarantors;

import io.jmix.ui.screen.*;
import com.company.customerservice.entity.Guarantors;

@UiController("Guarantors.browse")
@UiDescriptor("guarantors-browse.xml")
@LookupComponent("guarantorsesTable")
public class GuarantorsBrowse extends StandardLookup<Guarantors> {
}