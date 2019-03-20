/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Invoices.
 */
public class InvoicesInner {
    /** The Retrofit service to perform REST calls. */
    private InvoicesService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of InvoicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InvoicesInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(InvoicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Invoices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InvoicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Invoices get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoices/{invoiceName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("invoiceName") String invoiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the invoice by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoide Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSummaryInner object if successful.
     */
    public InvoiceSummaryInner get(String billingAccountName, String billingProfileName, String invoiceName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceName).toBlocking().single().body();
    }

    /**
     * Get the invoice by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoide Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSummaryInner> getAsync(String billingAccountName, String billingProfileName, String invoiceName, final ServiceCallback<InvoiceSummaryInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceName), serviceCallback);
    }

    /**
     * Get the invoice by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoide Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSummaryInner object
     */
    public Observable<InvoiceSummaryInner> getAsync(String billingAccountName, String billingProfileName, String invoiceName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceName).map(new Func1<ServiceResponse<InvoiceSummaryInner>, InvoiceSummaryInner>() {
            @Override
            public InvoiceSummaryInner call(ServiceResponse<InvoiceSummaryInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the invoice by id.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoide Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSummaryInner object
     */
    public Observable<ServiceResponse<InvoiceSummaryInner>> getWithServiceResponseAsync(String billingAccountName, String billingProfileName, String invoiceName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (invoiceName == null) {
            throw new IllegalArgumentException("Parameter invoiceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, billingProfileName, invoiceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoiceSummaryInner>>>() {
                @Override
                public Observable<ServiceResponse<InvoiceSummaryInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoiceSummaryInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoiceSummaryInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InvoiceSummaryInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoiceSummaryInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
