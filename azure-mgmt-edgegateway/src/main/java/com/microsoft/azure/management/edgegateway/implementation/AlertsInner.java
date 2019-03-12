/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Alerts.
 */
public class AlertsInner {
    /** The Retrofit service to perform REST calls. */
    private AlertsService service;
    /** The service client containing this operation class. */
    private DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of AlertsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AlertsInner(Retrofit retrofit, DataBoxEdgeManagementClientImpl client) {
        this.service = retrofit.create(AlertsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Alerts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AlertsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.edgegateway.Alerts listByDataBoxEdgeDevice" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/alerts")
        Observable<Response<ResponseBody>> listByDataBoxEdgeDevice(@Path("deviceName") String deviceName, @Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.edgegateway.Alerts get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/alerts/{name}")
        Observable<Response<ResponseBody>> get(@Path("deviceName") String deviceName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.edgegateway.Alerts listByDataBoxEdgeDeviceNext" })
        @GET
        Observable<Response<ResponseBody>> listByDataBoxEdgeDeviceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AlertInner&gt; object if successful.
     */
    public PagedList<AlertInner> listByDataBoxEdgeDevice(final String deviceName, final String resourceGroupName) {
        ServiceResponse<Page<AlertInner>> response = listByDataBoxEdgeDeviceSinglePageAsync(deviceName, resourceGroupName).toBlocking().single();
        return new PagedList<AlertInner>(response.body()) {
            @Override
            public Page<AlertInner> nextPage(String nextPageLink) {
                return listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AlertInner>> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName, final ListOperationCallback<AlertInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDataBoxEdgeDeviceSinglePageAsync(deviceName, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(String nextPageLink) {
                    return listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AlertInner&gt; object
     */
    public Observable<Page<AlertInner>> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        return listByDataBoxEdgeDeviceWithServiceResponseAsync(deviceName, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<AlertInner>>, Page<AlertInner>>() {
                @Override
                public Page<AlertInner> call(ServiceResponse<Page<AlertInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AlertInner&gt; object
     */
    public Observable<ServiceResponse<Page<AlertInner>>> listByDataBoxEdgeDeviceWithServiceResponseAsync(final String deviceName, final String resourceGroupName) {
        return listByDataBoxEdgeDeviceSinglePageAsync(deviceName, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<AlertInner>>, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(ServiceResponse<Page<AlertInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDataBoxEdgeDeviceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
    ServiceResponse<PageImpl<AlertInner>> * @param deviceName The device name.
    ServiceResponse<PageImpl<AlertInner>> * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AlertInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AlertInner>>> listByDataBoxEdgeDeviceSinglePageAsync(final String deviceName, final String resourceGroupName) {
        if (deviceName == null) {
            throw new IllegalArgumentException("Parameter deviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDataBoxEdgeDevice(deviceName, this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AlertInner>> result = listByDataBoxEdgeDeviceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AlertInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AlertInner>> listByDataBoxEdgeDeviceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AlertInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AlertInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AlertInner object if successful.
     */
    public AlertInner get(String deviceName, String name, String resourceGroupName) {
        return getWithServiceResponseAsync(deviceName, name, resourceGroupName).toBlocking().single().body();
    }

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AlertInner> getAsync(String deviceName, String name, String resourceGroupName, final ServiceCallback<AlertInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(deviceName, name, resourceGroupName), serviceCallback);
    }

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlertInner object
     */
    public Observable<AlertInner> getAsync(String deviceName, String name, String resourceGroupName) {
        return getWithServiceResponseAsync(deviceName, name, resourceGroupName).map(new Func1<ServiceResponse<AlertInner>, AlertInner>() {
            @Override
            public AlertInner call(ServiceResponse<AlertInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlertInner object
     */
    public Observable<ServiceResponse<AlertInner>> getWithServiceResponseAsync(String deviceName, String name, String resourceGroupName) {
        if (deviceName == null) {
            throw new IllegalArgumentException("Parameter deviceName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(deviceName, name, this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AlertInner>>>() {
                @Override
                public Observable<ServiceResponse<AlertInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AlertInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AlertInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AlertInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AlertInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AlertInner&gt; object if successful.
     */
    public PagedList<AlertInner> listByDataBoxEdgeDeviceNext(final String nextPageLink) {
        ServiceResponse<Page<AlertInner>> response = listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AlertInner>(response.body()) {
            @Override
            public Page<AlertInner> nextPage(String nextPageLink) {
                return listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AlertInner>> listByDataBoxEdgeDeviceNextAsync(final String nextPageLink, final ServiceFuture<List<AlertInner>> serviceFuture, final ListOperationCallback<AlertInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(String nextPageLink) {
                    return listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AlertInner&gt; object
     */
    public Observable<Page<AlertInner>> listByDataBoxEdgeDeviceNextAsync(final String nextPageLink) {
        return listByDataBoxEdgeDeviceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AlertInner>>, Page<AlertInner>>() {
                @Override
                public Page<AlertInner> call(ServiceResponse<Page<AlertInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AlertInner&gt; object
     */
    public Observable<ServiceResponse<Page<AlertInner>>> listByDataBoxEdgeDeviceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByDataBoxEdgeDeviceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AlertInner>>, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(ServiceResponse<Page<AlertInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDataBoxEdgeDeviceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
    ServiceResponse<PageImpl<AlertInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AlertInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AlertInner>>> listByDataBoxEdgeDeviceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByDataBoxEdgeDeviceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AlertInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AlertInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AlertInner>> result = listByDataBoxEdgeDeviceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AlertInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AlertInner>> listByDataBoxEdgeDeviceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AlertInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AlertInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
