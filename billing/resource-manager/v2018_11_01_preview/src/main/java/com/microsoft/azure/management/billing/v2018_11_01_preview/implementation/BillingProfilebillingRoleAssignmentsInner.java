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
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleAssignmentPayload;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingProfilebillingRoleAssignments.
 */
public class BillingProfilebillingRoleAssignmentsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingProfilebillingRoleAssignmentsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingProfilebillingRoleAssignmentsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingProfilebillingRoleAssignmentsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingProfilebillingRoleAssignmentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingProfilebillingRoleAssignments to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingProfilebillingRoleAssignmentsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingRoleAssignments get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/providers/Microsoft.Billing/billingRoleAssignments/{billingRoleAssignmentName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("billingRoleAssignmentName") String billingRoleAssignmentName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingRoleAssignments delete" })
        @HTTP(path = "providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/providers/Microsoft.Billing/billingRoleAssignments/{billingRoleAssignmentName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("billingRoleAssignmentName") String billingRoleAssignmentName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingRoleAssignments list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/providers/Microsoft.Billing/billingRoleAssignments")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingRoleAssignments add" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/providers/Microsoft.Billing/createBillingRoleAssignment")
        Observable<Response<ResponseBody>> add(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body BillingRoleAssignmentPayload parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the role assignment for the caller on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleAssignmentInner object if successful.
     */
    public BillingRoleAssignmentInner get(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName).toBlocking().single().body();
    }

    /**
     * Get the role assignment for the caller on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleAssignmentInner> getAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName, final ServiceCallback<BillingRoleAssignmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName), serviceCallback);
    }

    /**
     * Get the role assignment for the caller on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentInner object
     */
    public Observable<BillingRoleAssignmentInner> getAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName).map(new Func1<ServiceResponse<BillingRoleAssignmentInner>, BillingRoleAssignmentInner>() {
            @Override
            public BillingRoleAssignmentInner call(ServiceResponse<BillingRoleAssignmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the role assignment for the caller on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentInner object
     */
    public Observable<ServiceResponse<BillingRoleAssignmentInner>> getWithServiceResponseAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (billingRoleAssignmentName == null) {
            throw new IllegalArgumentException("Parameter billingRoleAssignmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, billingProfileName, billingRoleAssignmentName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleAssignmentInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleAssignmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleAssignmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleAssignmentInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleAssignmentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingRoleAssignmentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete the role assignment on this Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleAssignmentInner object if successful.
     */
    public BillingRoleAssignmentInner delete(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        return deleteWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName).toBlocking().single().body();
    }

    /**
     * Delete the role assignment on this Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleAssignmentInner> deleteAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName, final ServiceCallback<BillingRoleAssignmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName), serviceCallback);
    }

    /**
     * Delete the role assignment on this Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentInner object
     */
    public Observable<BillingRoleAssignmentInner> deleteAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        return deleteWithServiceResponseAsync(billingAccountName, billingProfileName, billingRoleAssignmentName).map(new Func1<ServiceResponse<BillingRoleAssignmentInner>, BillingRoleAssignmentInner>() {
            @Override
            public BillingRoleAssignmentInner call(ServiceResponse<BillingRoleAssignmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete the role assignment on this Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentInner object
     */
    public Observable<ServiceResponse<BillingRoleAssignmentInner>> deleteWithServiceResponseAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (billingRoleAssignmentName == null) {
            throw new IllegalArgumentException("Parameter billingRoleAssignmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(billingAccountName, billingProfileName, billingRoleAssignmentName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleAssignmentInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleAssignmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleAssignmentInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleAssignmentInner> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleAssignmentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingRoleAssignmentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the role assignments on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleAssignmentListResultInner object if successful.
     */
    public BillingRoleAssignmentListResultInner list(String billingAccountName, String billingProfileName) {
        return listWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * Get the role assignments on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleAssignmentListResultInner> listAsync(String billingAccountName, String billingProfileName, final ServiceCallback<BillingRoleAssignmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * Get the role assignments on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentListResultInner object
     */
    public Observable<BillingRoleAssignmentListResultInner> listAsync(String billingAccountName, String billingProfileName) {
        return listWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<BillingRoleAssignmentListResultInner>, BillingRoleAssignmentListResultInner>() {
            @Override
            public BillingRoleAssignmentListResultInner call(ServiceResponse<BillingRoleAssignmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the role assignments on the Billing Profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentListResultInner object
     */
    public Observable<ServiceResponse<BillingRoleAssignmentListResultInner>> listWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountName, billingProfileName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleAssignmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleAssignmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleAssignmentListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleAssignmentListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleAssignmentListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingRoleAssignmentListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * The operation to add a role assignment to a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleAssignmentListResultInner object if successful.
     */
    public BillingRoleAssignmentListResultInner add(String billingAccountName, String billingProfileName) {
        return addWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * The operation to add a role assignment to a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleAssignmentListResultInner> addAsync(String billingAccountName, String billingProfileName, final ServiceCallback<BillingRoleAssignmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * The operation to add a role assignment to a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentListResultInner object
     */
    public Observable<BillingRoleAssignmentListResultInner> addAsync(String billingAccountName, String billingProfileName) {
        return addWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<BillingRoleAssignmentListResultInner>, BillingRoleAssignmentListResultInner>() {
            @Override
            public BillingRoleAssignmentListResultInner call(ServiceResponse<BillingRoleAssignmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to add a role assignment to a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleAssignmentListResultInner object
     */
    public Observable<ServiceResponse<BillingRoleAssignmentListResultInner>> addWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.add(billingAccountName, billingProfileName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleAssignmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleAssignmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleAssignmentListResultInner> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleAssignmentListResultInner> addDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleAssignmentListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<BillingRoleAssignmentListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
