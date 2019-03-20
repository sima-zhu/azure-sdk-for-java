/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoicesByBillingAccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoicesByBillingAccounts.
 */
public interface InvoicesByBillingAccounts extends HasInner<InvoicesByBillingAccountsInner> {
    /**
     * List of invoices for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceListResult> listAsync(String billingAccountName, String periodStartDate, String periodEndDate);

}
