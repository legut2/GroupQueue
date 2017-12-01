package com.example.groupqueueprototype.android_studio_project_folder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.widget.Button;
import com.spotify.sdk.android.authentication.*;
import android.view.View;
import android.app.Activity;
import com.spotify.sdk.android.player.*;
import java.lang.Error;

public class LoginActivity extends AppCompatActivity {
    private Button loginWithSpotify;
    private static final String REDIRECT_URI = "groupqueue://callback";
    private static final String CLIENT_ID = "3f532b5955df4d539ff9941a5b7201fa";
    private Activity thisActivity = this;
    private static final int REQUEST_CODE = 1337;
    private Player mPlayer;
    protected View.OnClickListener loginOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AuthenticationRequest.Builder builder =
                    new AuthenticationRequest.Builder(CLIENT_ID, AuthenticationResponse.Type.TOKEN, REDIRECT_URI);

            builder.setScopes(new String[]{"user-read-private", "streaming"});
            AuthenticationRequest request = builder.build();
            //Attempt to logon with spotify if already downloaded and logged in on their app
            AuthenticationClient.openLoginActivity(thisActivity, REQUEST_CODE, request);
            //Web browser attempt fallback option
            //AuthenticationClient.openLoginInBrowser(thisActivity, request);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginWithSpotify = (Button) findViewById(R.id.loginSpotify);
        loginWithSpotify.setOnClickListener(loginOnClickListener);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        // Check if result comes from the correct activity
        if (requestCode == REQUEST_CODE) {
            AuthenticationResponse response = AuthenticationClient.getResponse(resultCode, intent);
            if (response.getType() == AuthenticationResponse.Type.TOKEN) {
//                Config playerConfig = new Config(this, response.getAccessToken(), CLIENT_ID);
//                Spotify.getPlayer(playerConfig, this, new SpotifyPlayer.InitializationObserver() {
//                    @Override
//                    public void onInitialized(SpotifyPlayer spotifyPlayer) {
//                        mPlayer = spotifyPlayer;
//                        mPlayer.addConnectionStateCallback(LoginActivity.this);
//                        mPlayer.addNotificationCallback(LoginActivity.this);
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//                        Log.e("MainActivity", "Could not initialize player: " + throwable.getMessage());
//                    }
//                });
                loginWithSpotify.setText("You're now logged into Spotify!");
                goToPartySearch();
            }
        }
    }
    public void goToPartySearch() {
        Intent intent = new Intent(this, PartySearchActivity.class);
        startActivity(intent);
    }
}
