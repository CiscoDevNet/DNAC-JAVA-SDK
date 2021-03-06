/*
 * Swagger
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cisco.com.dnac.v1.api.client.api;

import cisco.com.dnac.v1.api.client.ApiCallback;
import cisco.com.dnac.v1.api.client.ApiClient;
import cisco.com.dnac.v1.api.client.ApiException;
import cisco.com.dnac.v1.api.client.ApiResponse;
import cisco.com.dnac.v1.api.client.Configuration;
import cisco.com.dnac.v1.api.client.Pair;
import cisco.com.dnac.v1.api.client.ProgressRequestBody;
import cisco.com.dnac.v1.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cisco.com.dnac.v1.api.client.model.FlowAnalysisListOutput;
import cisco.com.dnac.v1.api.client.model.TaskIdResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowAnalysisApi {
    private ApiClient apiClient;

    public FlowAnalysisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlowAnalysisApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteFlowAnalysisByFlowAnalysisId
     * @param flowAnalysisId Flow analysis request id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFlowAnalysisByFlowAnalysisIdCall(String flowAnalysisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/flow-analysis/${flowAnalysisId}"
            .replaceAll("\\{" + "flowAnalysisId" + "\\}", apiClient.escapeString(flowAnalysisId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFlowAnalysisByFlowAnalysisIdValidateBeforeCall(String flowAnalysisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'flowAnalysisId' is set
        if (flowAnalysisId == null) {
            throw new ApiException("Missing the required parameter 'flowAnalysisId' when calling deleteFlowAnalysisByFlowAnalysisId(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteFlowAnalysisByFlowAnalysisIdCall(flowAnalysisId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a flow analysis request
     * Deletes a flow analysis request by its id
     * @param flowAnalysisId Flow analysis request id (required)
     * @return TaskIdResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TaskIdResult deleteFlowAnalysisByFlowAnalysisId(String flowAnalysisId) throws ApiException {
        ApiResponse<TaskIdResult> resp = deleteFlowAnalysisByFlowAnalysisIdWithHttpInfo(flowAnalysisId);
        return resp.getData();
    }

    /**
     * Deletes a flow analysis request
     * Deletes a flow analysis request by its id
     * @param flowAnalysisId Flow analysis request id (required)
     * @return ApiResponse&lt;TaskIdResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TaskIdResult> deleteFlowAnalysisByFlowAnalysisIdWithHttpInfo(String flowAnalysisId) throws ApiException {
        com.squareup.okhttp.Call call = deleteFlowAnalysisByFlowAnalysisIdValidateBeforeCall(flowAnalysisId, null, null);
        Type localVarReturnType = new TypeToken<TaskIdResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a flow analysis request (asynchronously)
     * Deletes a flow analysis request by its id
     * @param flowAnalysisId Flow analysis request id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFlowAnalysisByFlowAnalysisIdAsync(String flowAnalysisId, final ApiCallback<TaskIdResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFlowAnalysisByFlowAnalysisIdValidateBeforeCall(flowAnalysisId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TaskIdResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFlowAnalysis
     * @param periodicRefresh Is analysis periodically refreshed? (optional)
     * @param sourceIP Source IP address (optional)
     * @param destIP Destination IP adress (optional)
     * @param sourcePort Source port (optional)
     * @param destPort Destination port (optional)
     * @param gtCreateTime Analyses requested after this time (optional)
     * @param ltCreateTime Analyses requested before this time (optional)
     * @param protocol Protocol (optional)
     * @param status Status (optional)
     * @param taskId Task ID (optional)
     * @param lastUpdateTime Last update time (optional)
     * @param limit Number of resources returned (optional)
     * @param offset Start index of resources returned (1-based) (optional)
     * @param order Order by this field (optional)
     * @param sortBy Sort by this field (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFlowAnalysisCall(Boolean periodicRefresh, String sourceIP, String destIP, String sourcePort, String destPort, String gtCreateTime, String ltCreateTime, String protocol, String status, String taskId, String lastUpdateTime, String limit, String offset, String order, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/flow-analysis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (periodicRefresh != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("periodicRefresh", periodicRefresh));
        if (sourceIP != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sourceIP", sourceIP));
        if (destIP != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("destIP", destIP));
        if (sourcePort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sourcePort", sourcePort));
        if (destPort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("destPort", destPort));
        if (gtCreateTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gtCreateTime", gtCreateTime));
        if (ltCreateTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ltCreateTime", ltCreateTime));
        if (protocol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("protocol", protocol));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (taskId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("taskId", taskId));
        if (lastUpdateTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastUpdateTime", lastUpdateTime));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFlowAnalysisValidateBeforeCall(Boolean periodicRefresh, String sourceIP, String destIP, String sourcePort, String destPort, String gtCreateTime, String ltCreateTime, String protocol, String status, String taskId, String lastUpdateTime, String limit, String offset, String order, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getFlowAnalysisCall(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves a summary of all flow analyses stored
     * Retrieves a summary of all flow analyses stored. Filters the results by given parameters.
     * @param periodicRefresh Is analysis periodically refreshed? (optional)
     * @param sourceIP Source IP address (optional)
     * @param destIP Destination IP adress (optional)
     * @param sourcePort Source port (optional)
     * @param destPort Destination port (optional)
     * @param gtCreateTime Analyses requested after this time (optional)
     * @param ltCreateTime Analyses requested before this time (optional)
     * @param protocol Protocol (optional)
     * @param status Status (optional)
     * @param taskId Task ID (optional)
     * @param lastUpdateTime Last update time (optional)
     * @param limit Number of resources returned (optional)
     * @param offset Start index of resources returned (1-based) (optional)
     * @param order Order by this field (optional)
     * @param sortBy Sort by this field (optional)
     * @return FlowAnalysisListOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FlowAnalysisListOutput getFlowAnalysis(Boolean periodicRefresh, String sourceIP, String destIP, String sourcePort, String destPort, String gtCreateTime, String ltCreateTime, String protocol, String status, String taskId, String lastUpdateTime, String limit, String offset, String order, String sortBy) throws ApiException {
        ApiResponse<FlowAnalysisListOutput> resp = getFlowAnalysisWithHttpInfo(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy);
        return resp.getData();
    }

    /**
     * Retrieves a summary of all flow analyses stored
     * Retrieves a summary of all flow analyses stored. Filters the results by given parameters.
     * @param periodicRefresh Is analysis periodically refreshed? (optional)
     * @param sourceIP Source IP address (optional)
     * @param destIP Destination IP adress (optional)
     * @param sourcePort Source port (optional)
     * @param destPort Destination port (optional)
     * @param gtCreateTime Analyses requested after this time (optional)
     * @param ltCreateTime Analyses requested before this time (optional)
     * @param protocol Protocol (optional)
     * @param status Status (optional)
     * @param taskId Task ID (optional)
     * @param lastUpdateTime Last update time (optional)
     * @param limit Number of resources returned (optional)
     * @param offset Start index of resources returned (1-based) (optional)
     * @param order Order by this field (optional)
     * @param sortBy Sort by this field (optional)
     * @return ApiResponse&lt;FlowAnalysisListOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FlowAnalysisListOutput> getFlowAnalysisWithHttpInfo(Boolean periodicRefresh, String sourceIP, String destIP, String sourcePort, String destPort, String gtCreateTime, String ltCreateTime, String protocol, String status, String taskId, String lastUpdateTime, String limit, String offset, String order, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getFlowAnalysisValidateBeforeCall(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy, null, null);
        Type localVarReturnType = new TypeToken<FlowAnalysisListOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a summary of all flow analyses stored (asynchronously)
     * Retrieves a summary of all flow analyses stored. Filters the results by given parameters.
     * @param periodicRefresh Is analysis periodically refreshed? (optional)
     * @param sourceIP Source IP address (optional)
     * @param destIP Destination IP adress (optional)
     * @param sourcePort Source port (optional)
     * @param destPort Destination port (optional)
     * @param gtCreateTime Analyses requested after this time (optional)
     * @param ltCreateTime Analyses requested before this time (optional)
     * @param protocol Protocol (optional)
     * @param status Status (optional)
     * @param taskId Task ID (optional)
     * @param lastUpdateTime Last update time (optional)
     * @param limit Number of resources returned (optional)
     * @param offset Start index of resources returned (1-based) (optional)
     * @param order Order by this field (optional)
     * @param sortBy Sort by this field (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFlowAnalysisAsync(Boolean periodicRefresh, String sourceIP, String destIP, String sourcePort, String destPort, String gtCreateTime, String ltCreateTime, String protocol, String status, String taskId, String lastUpdateTime, String limit, String offset, String order, String sortBy, final ApiCallback<FlowAnalysisListOutput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFlowAnalysisValidateBeforeCall(periodicRefresh, sourceIP, destIP, sourcePort, destPort, gtCreateTime, ltCreateTime, protocol, status, taskId, lastUpdateTime, limit, offset, order, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FlowAnalysisListOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
