package com.company.customerservice.screen.guarantors;

import io.jmix.ui.screen.*;
import com.company.customerservice.entity.Guarantors;

@UiController("Guarantors.edit")
@UiDescriptor("guarantors-edit.xml")
@EditedEntityContainer("guarantorsDc")
public class GuarantorsEdit extends StandardEditor<Guarantors> {
}