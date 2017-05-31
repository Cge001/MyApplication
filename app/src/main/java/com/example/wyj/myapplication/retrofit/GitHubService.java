package com.example.wyj.myapplication.retrofit;

import com.example.wyj.myapplication.retrofit.bean.Contributor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by WangYajun on 2017/5/2 0002.
 */

public interface GitHubService {

    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> contributorsBySimpleGetCall(@Path("owner") String owner,
                                                        @Path("repo") String repo);
}
