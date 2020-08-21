package chitchat.com.Fragments;

import chitchat.com.Notifications.MyResponse;
import chitchat.com.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
@Headers(
        {
                "Content-Type:application/json",
                "Authorization:key=AAAA0tqniPQ:APA91bH0GtjX8et6bX1VNdD145CDQAE541z5JXejyFh12Q8XuKBaybBf-0A7ZT3Vgr4W8WYoPATozbLuqb4VoEaXpILNZMve43K8lGYwBBFXsDtdgKKgCSNWBsEs2TGkFiBdkYCSoSkM"
        }
)

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
