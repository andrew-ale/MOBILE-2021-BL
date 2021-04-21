package id.ac.umn.w11_27137;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostServices {

    @GET("posts")
    Call<ArrayList<PostModel>> getPost();
}
